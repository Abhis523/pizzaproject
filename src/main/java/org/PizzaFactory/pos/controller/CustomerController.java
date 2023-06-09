package org.PizzaFactory.pos.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.PizzaFactory.pos.domain.Customer;
import org.PizzaFactory.pos.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController
{

  @Autowired
  CustomerRepository customerRepo;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getRoot(ModelMap model)
  {
    return "redirect:/orders";
  }

  @RequestMapping(value = "/customers", method = RequestMethod.GET)
  public String getCustomers(ModelMap model, HttpServletRequest request)
  {
    Customer customer = null;
    if (request.getSession().getAttribute("customer") != null)
    {
      customer = (Customer) request.getSession().getAttribute("customer");
    } else
    {
      customer = new Customer();
    }
    model.put("customer", customer);
    return "customers";
  }

  @RequestMapping(value = "/customers", method = RequestMethod.POST)
  public String postCustomers(ModelMap model, @ModelAttribute("customer") Customer customer, HttpServletRequest request)
  {

    request.getSession().setAttribute("customer", customer);
    customerRepo.save(customer);

    return "redirect:/orders";
  }

}
