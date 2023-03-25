/*package org.PizzaFactory.pos.controller;

import java.util.Optional;

import org.PizzaFactory.pos.domain.Order;
import org.PizzaFactory.pos.domain.Pizza;
import org.PizzaFactory.pos.domain.Topping;
import org.PizzaFactory.pos.enums.PizzaCrustEnum;
import org.PizzaFactory.pos.enums.PizzaSizeEnum;
import org.PizzaFactory.pos.repository.OrderRepository;
import org.PizzaFactory.pos.repository.PizzaRepository;
import org.PizzaFactory.pos.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/orders/{orderId}/pizzas")
public class PizzaController
{

  @Autowired
  private OrderRepository orderRepo;
  
  @Autowired
  private PizzaRepository pizzaRepo;

  @Autowired
  private ToppingRepository toppingRepo;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String pizzaGet(ModelMap model, @PathVariable Long orderId)
  {

    model.put("pizzaSizes", PizzaSizeEnum.values());
    model.put("pizzaCrustTypes", PizzaCrustEnum.values());
    model.put("toppings", toppingRepo.findAll());

    Pizza pizza = new Pizza();
    model.put("pizza", pizza);

    return "pizzas";
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public String pizzaPost(ModelMap model, @PathVariable Long orderId, @ModelAttribute Pizza pizza)
  {
    Object order = orderRepo.findById(orderId);
    
    Double pizzaPrice = 0.0;
    
    for (Topping topping : pizza.getToppings())
    {
      topping.getPizzas().add(pizza);
      pizzaPrice += topping.getPrice();
    }
    
    pizzaPrice += pizza.getCrustType().getPrice();
    pizzaPrice += pizza.getSize().getPrice();
    pizza.setPrice(pizzaPrice);
   pizza.setOrder( (Order) order);
    ((Order) order).getPizzas().add(pizza);

    orderRepo.save(order);

    return "redirect:/orders/" + orderId;
  }

  @RequestMapping(value = "/{pizzaId}/delete", method = RequestMethod.POST)
  public String pizzaPostDelete(@PathVariable Long orderId, @PathVariable Long pizzaId){
    Object order = orderRepo.findById(orderId);
    
    //you must remember to remove the children in order for the cascades to work
    Pizza pizzaToDelete = null;
    for (Pizza pizza : ((Order) order).getPizzas()){
      if(pizza.getPizzaId().equals(pizzaId)){
        pizzaToDelete = pizza;
        
      }
    }
    if(pizzaToDelete != null){
      pizzaToDelete.getToppings().clear();
      ((Order) order).getPizzas().remove(pizzaToDelete);
      pizzaToDelete.setOrder(null);
    }
    
    orderRepo.save(order);*/

/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.Optional;
 * 
 * import org.PizzaFactory.pos.domain.Order; import
 * org.PizzaFactory.pos.domain.Pizza; import org.PizzaFactory.pos.domain.Topping;
 * import org.PizzaFactory.pos.enums.PizzaCrustEnum; import
 * org.PizzaFactory.pos.enums.PizzaSizeEnum; import
 * org.PizzaFactory.pos.repository.OrderRepository; import
 * org.PizzaFactory.pos.repository.PizzaRepository; import
 * org.PizzaFactory.pos.repository.ToppingRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.PizzaFactory.pos.enums.PizzaTypeEnum;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders/{orderId}/pizzas") public class
 * PizzaController {
 * 
 * @Autowired private OrderRepository orderRepo;
 * 
 * @Autowired private PizzaRepository pizzaRepo;
 * 
 * @Autowired private ToppingRepository toppingRepo;
 * 
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * pizzaGet(ModelMap model, @PathVariable Long orderId) {
 * 
 * model.put("pizzaSizes", PizzaSizeEnum.values()); model.put("pizzaCrustTypes",
 * PizzaCrustEnum.values()); model.put("toppings", toppingRepo.findAll());
 * 
 * Pizza pizza = new Pizza(); model.put("pizza", pizza);
 * 
 * return "pizzas"; }
 * 
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * pizzaPost(ModelMap model, @PathVariable Long orderId, @ModelAttribute Pizza
 * pizza) { Order order = orderRepo.findById(orderId).get();
 * 
 * Double pizzaPrice = 0.0;
 * 
 * for (Topping topping : pizza.getToppings()) { topping.getPizzas().add(pizza);
 * pizzaPrice += topping.getPrice(); }
 * 
 * pizzaPrice += pizza.getCrustType().getPrice(); pizzaPrice +=
 * pizza.getSize().getPrice(); pizza.setPrice(pizzaPrice);
 * pizza.setOrder(order); order.getPizzas().add(pizza);
 * 
 * pizzaRepo.save(pizza); orderRepo.save(order);
 * 
 * return "redirect:/orders/" + orderId; }
 * 
 * }
 */
/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.Optional;
 * 
 * import org.PizzaFactory.pos.domain.Order; import
 * org.PizzaFactory.pos.domain.Pizza; import
 * org.PizzaFactory.pos.domain.Topping; import
 * org.PizzaFactory.pos.enums.PizzaCrustEnum; import
 * org.PizzaFactory.pos.enums.PizzaSizeEnum; import
 * org.PizzaFactory.pos.repository.OrderRepository; import
 * org.PizzaFactory.pos.repository.PizzaRepository; import
 * org.PizzaFactory.pos.repository.ToppingRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.PizzaFactory.pos.enums.PizzaTypeEnum;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders/{orderId}/pizzas") public class
 * PizzaController {
 * 
 * @Autowired private OrderRepository orderRepo;
 * 
 * @Autowired private PizzaRepository pizzaRepo;
 * 
 * @Autowired private ToppingRepository toppingRepo;
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * pizzaGet(ModelMap model, @PathVariable Long orderId) {
 * model.put("pizzaSizes", PizzaSizeEnum.values()); model.put("pizzaCrustTypes",
 * PizzaCrustEnum.values()); model.put("toppings", toppingRepo.findAll());
 * model.put("pizzaTypes", PizzaTypeEnum.values());
 * 
 * Pizza pizza = new Pizza(); model.put("pizza", pizza);
 * 
 * return "pizzas"; }
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * pizzaPost(ModelMap model, @PathVariable Long orderId, @ModelAttribute Pizza
 * pizza) { Order order = orderRepo.findById(orderId).get();
 * 
 * Double pizzaPrice = 0.0;
 * 
 * for (Topping topping : pizza.getToppings()) { topping.getPizzas().add(pizza);
 * pizzaPrice += topping.getPrice(); }
 * 
 * pizzaPrice += pizza.getCrustType().getPrice(); pizzaPrice +=
 * pizza.getSize().getPrice(); pizza.setPrice(pizzaPrice);
 * pizza.setOrder(order); order.getPizzas().add(pizza);
 * 
 * pizzaRepo.save(pizza); orderRepo.save(order);
 * 
 * return "redirect:/orders/" + orderId; } }
 */
package org.PizzaFactory.pos.controller;

import java.util.Optional;

import org.PizzaFactory.pos.domain.Order;
import org.PizzaFactory.pos.domain.Pizza;
import org.PizzaFactory.pos.domain.Topping;
import org.PizzaFactory.pos.enums.PizzaCrustEnum;
import org.PizzaFactory.pos.enums.PizzaSizeEnum;
import org.PizzaFactory.pos.repository.OrderRepository;
import org.PizzaFactory.pos.repository.PizzaRepository;
import org.PizzaFactory.pos.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.PizzaFactory.pos.enums.PizzaTypeEnum;
import org.PizzaFactory.pos.enums.Side;

@Controller
@RequestMapping(value = "/orders/{orderId}/pizzas")
public class PizzaController {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private PizzaRepository pizzaRepo;

    @Autowired
    private ToppingRepository toppingRepo;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String pizzaGet(ModelMap model, @PathVariable Long orderId) {
        model.put("pizzaSizes", PizzaSizeEnum.values());
        model.put("pizzaCrustTypes", PizzaCrustEnum.values());
        model.put("toppings", toppingRepo.findAll());
        model.put("pizzaTypes", PizzaTypeEnum.values());
        model.put("pizzaSides", Side.values());

        Pizza pizza = new Pizza();
        model.put("pizza", pizza);

        return "pizzas";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String pizzaPost(ModelMap model, @PathVariable Long orderId, @ModelAttribute Pizza pizza) {
        Order order = orderRepo.findById(orderId).get();

        Double pizzaPrice = 0.0;

        for (Topping topping : pizza.getToppings()) {
            topping.getPizzas().add(pizza);
            pizzaPrice += topping.getPrice();
        }

        pizzaPrice += pizza.getCrustType().getPrice();
        pizzaPrice += pizza.getSize().getPrice();
        pizzaPrice += pizza.getSide().getPrice();
        pizza.setPrice(pizzaPrice);
        pizza.setOrder(order);
        order.getPizzas().add(pizza);

        pizzaRepo.save(pizza);
        orderRepo.save(order);

        return "redirect:/orders/" + orderId;
    }
}

