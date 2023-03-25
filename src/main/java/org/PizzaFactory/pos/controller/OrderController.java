/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.List;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * import org.PizzaFactory.pos.domain.Customer; import
 * org.PizzaFactory.pos.domain.Order; import org.PizzaFactory.pos.domain.Pizza;
 * import org.PizzaFactory.pos.repository.OrderRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders") public class OrderController {
 * 
 * @Autowired OrderRepository orderRepository;
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * orderGet(ModelMap model, HttpServletRequest request) {
 * 
 * List<Order> orders = orderRepository.findAll();
 * 
 * model.put("orders", orders);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * orderPost(ModelMap model, HttpServletRequest request, @ModelAttribute Order
 * order) {
 * 
 * Customer customer = (Customer) request.getSession().getAttribute("customer");
 * order.setCustomer(customer);
 * 
 * orderRepository.save(order);
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.GET) public
 * String orderGetWithId(ModelMap model, @PathVariable Long orderId) { Order
 * order = orderRepository.findById(orderId).orElse(null);
 * 
 * 
 * model.put("order", order);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.POST) public
 * String orderPostWithId(ModelMap model, HttpServletRequest
 * request, @ModelAttribute Order order,
 * 
 * @PathVariable Long orderId) {
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}/finalize", method = RequestMethod.POST)
 * public String orderPostFinalize(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Object order =
 * orderRepository.findById(orderId); evaluateFinalPrice((Order) order);
 * ((Order) order).setCompleted(true); orderRepository.saveAll(order);
 * 
 * // could send email (more order finalization tasks)
 * 
 * return "redirect:/orders"; }
 * 
 * @RequestMapping(value = "/{orderId}/review", method = RequestMethod.GET)
 * public String orderPostReview(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Object order =
 * orderRepository.findById(orderId); evaluateFinalPrice((Order) order);
 * model.put("order", order); return "review-order"; }
 * 
 * private void evaluateFinalPrice(Order order) { Double finalPrice = 0.0; for
 * (Pizza pizza : order.getPizzas()) { finalPrice += pizza.getPrice(); }
 * order.setFinalPrice(finalPrice); }
 * 
 * }
 */
/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.List;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * import org.PizzaFactory.pos.domain.Customer; import
 * org.PizzaFactory.pos.domain.Order; import org.PizzaFactory.pos.domain.Pizza;
 * import org.PizzaFactory.pos.repository.OrderRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders") public class OrderController {
 * 
 * @Autowired OrderRepository orderRepository;
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * orderGet(ModelMap model, HttpServletRequest request) {
 * 
 * List<Order> orders = orderRepository.findAll();
 * 
 * model.put("orders", orders);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * orderPost(ModelMap model, HttpServletRequest request, @ModelAttribute Order
 * order) {
 * 
 * Customer customer = (Customer) request.getSession().getAttribute("customer");
 * order.setCustomer(customer);
 * 
 * orderRepository.save(order);
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.GET) public
 * String orderGetWithId(ModelMap model, @PathVariable Long orderId) { Order
 * order = orderRepository.findById(orderId).orElse(null);
 * 
 * model.put("order", order);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.POST) public
 * String orderPostWithId(ModelMap model, HttpServletRequest
 * request, @ModelAttribute Order order,
 * 
 * @PathVariable Long orderId) {
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}/finalize", method = RequestMethod.POST)
 * public String orderPostFinalize(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * order.setCompleted(true); orderRepository.save(order);
 * 
 * // could send email (more order finalization tasks)
 * 
 * return "redirect:/orders"; }
 * 
 * @RequestMapping(value = "/{orderId}/review", method = RequestMethod.GET)
 * public String orderPostReview(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * model.put("order", order); return "review-order"; }
 * 
 * private void evaluateFinalPrice(Order order) { Double finalPrice = 0.0; for
 * (Pizza pizza : order.getPizzas()) { finalPrice += pizza.getPrice(); }
 * order.setFinalPrice(finalPrice); }
 * 
 * }
 */
/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.List;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * import org.PizzaFactory.pos.domain.Customer; import
 * org.PizzaFactory.pos.domain.Order; import org.PizzaFactory.pos.domain.Pizza;
 * import org.PizzaFactory.pos.repository.OrderRepository; import
 * org.PizzaFactory.pos.repository.ToppingRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders") public class OrderController {
 * 
 * @Autowired private OrderRepository orderRepository;
 * 
 * @Autowired private ToppingRepository toppingRepository;
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * orderGet(ModelMap model, HttpServletRequest request) {
 * 
 * List<Order> orders = orderRepository.findAll();
 * 
 * model.put("orders", orders);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * orderPost(ModelMap model, HttpServletRequest request, @ModelAttribute Order
 * order) {
 * 
 * Customer customer = (Customer) request.getSession().getAttribute("customer");
 * order.setCustomer(customer);
 * 
 * orderRepository.save(order);
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.GET) public
 * String orderGetWithId(ModelMap model, @PathVariable Long orderId) { Order
 * order = orderRepository.findById(orderId).orElse(null);
 * 
 * model.put("order", order);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.POST) public
 * String orderPostWithId(ModelMap model, HttpServletRequest
 * request, @ModelAttribute Order order,
 * 
 * @PathVariable Long orderId) {
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}/finalize", method = RequestMethod.POST)
 * public String orderPostFinalize(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * order.setCompleted(true); orderRepository.save(order);
 * 
 * // could send email (more order finalization tasks)
 * 
 * return "redirect:/orders"; }
 * 
 * @RequestMapping(value = "/{orderId}/review", method = RequestMethod.GET)
 * public String orderPostReview(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * model.put("order", order); model.put("toppings",
 * toppingRepository.findAll()); return "review-order"; }
 * 
 * private void evaluateFinalPrice(Order order) { Double finalPrice = 0.0; for
 * (Pizza pizza : order.getPizzas()) { finalPrice += pizza.getPrice(); }
 * order.setFinalPrice(finalPrice); }
 * 
 * }
 */
/*
 * package org.PizzaFactory.pos.controller;
 * 
 * import java.util.List;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * import org.PizzaFactory.pos.domain.Customer; import
 * org.PizzaFactory.pos.domain.Order; import org.PizzaFactory.pos.domain.Pizza;
 * import org.PizzaFactory.pos.enums.PizzaTypeEnum; import
 * org.PizzaFactory.pos.repository.OrderRepository; import
 * org.PizzaFactory.pos.repository.ToppingRepository; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.ui.ModelMap; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * @Controller
 * 
 * @RequestMapping(value = "/orders") public class OrderController {
 * 
 * @Autowired private OrderRepository orderRepository;
 * 
 * @Autowired private ToppingRepository toppingRepository;
 * 
 * @RequestMapping(value = "", method = RequestMethod.GET) public String
 * orderGet(ModelMap model, HttpServletRequest request) {
 * 
 * List<Order> orders = orderRepository.findAll();
 * 
 * model.put("orders", orders);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "", method = RequestMethod.POST) public String
 * orderPost(ModelMap model, HttpServletRequest request, @ModelAttribute Order
 * order) {
 * 
 * Customer customer = (Customer) request.getSession().getAttribute("customer");
 * order.setCustomer(customer);
 * 
 * orderRepository.save(order);
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.GET) public
 * String orderGetWithId(ModelMap model, @PathVariable Long orderId) { Order
 * order = orderRepository.findById(orderId).orElse(null);
 * 
 * model.put("order", order);
 * 
 * return "orders"; }
 * 
 * @RequestMapping(value = "/{orderId}", method = RequestMethod.POST) public
 * String orderPostWithId(ModelMap model, HttpServletRequest
 * request, @ModelAttribute Order order,
 * 
 * @PathVariable Long orderId) {
 * 
 * return "redirect:/orders/" + order.getOrderId() + "/pizzas"; }
 * 
 * @RequestMapping(value = "/{orderId}/finalize", method = RequestMethod.POST)
 * public String orderPostFinalize(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * order.setCompleted(true); orderRepository.save(order);
 * 
 * // could send email (more order finalization tasks)
 * 
 * return "redirect:/orders"; }
 * 
 * @RequestMapping(value = "/{orderId}/review", method = RequestMethod.GET)
 * public String orderPostReview(ModelMap model, HttpServletRequest
 * request, @PathVariable Long orderId) { Order order =
 * orderRepository.findById(orderId).orElse(null); evaluateFinalPrice(order);
 * model.put("order", order); model.put("toppings",
 * toppingRepository.findAll()); model.put("pizzaTypes",
 * PizzaTypeEnum.values()); return "review-order"; }
 * 
 * private void evaluateFinalPrice(Order order) { Double finalPrice = 0.0; for
 * (Pizza pizza : order.getPizzas()) { finalPrice += pizza.getPrice(); }
 * order.setFinalPrice(finalPrice); }
 * 
 * }
 */
package org.PizzaFactory.pos.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;

import org.PizzaFactory.pos.domain.Customer;
import org.PizzaFactory.pos.domain.Order;
import org.PizzaFactory.pos.domain.Pizza;
import org.PizzaFactory.pos.enums.Side;
import org.PizzaFactory.pos.enums.PizzaTypeEnum;
import org.PizzaFactory.pos.repository.OrderRepository;
import org.PizzaFactory.pos.repository.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/orders")
public class OrderController {

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private ToppingRepository toppingRepository;

  @RequestMapping(value = "", method = RequestMethod.GET)
  public String orderGet(ModelMap model, HttpServletRequest request) {

    List<Order> orders = orderRepository.findAll();

    model.put("orders", orders);

    return "orders";
  }

  @RequestMapping(value = "", method = RequestMethod.POST)
  public String orderPost(ModelMap model, HttpServletRequest request, @ModelAttribute Order order) {

    Customer customer = (Customer) request.getSession().getAttribute("customer");
    order.setCustomer(customer);

    orderRepository.save(order);

    return "redirect:/orders/" + order.getOrderId() + "/pizzas";
  }

  @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
  public String orderGetWithId(ModelMap model, @PathVariable Long orderId) {
    Order order = orderRepository.findById(orderId).orElse(null);

    model.put("order", order);

    return "orders";
  }

  @RequestMapping(value = "/{orderId}", method = RequestMethod.POST)
  public String orderPostWithId(ModelMap model, HttpServletRequest request, @ModelAttribute Order order,
      @PathVariable Long orderId) {

    return "redirect:/orders/" + order.getOrderId() + "/pizzas";
  }

  @RequestMapping(value = "/{orderId}/finalize", method = RequestMethod.POST)
  public String orderPostFinalize(ModelMap model, HttpServletRequest request, @PathVariable Long orderId) {
    Order order = orderRepository.findById(orderId).orElse(null);
    evaluateFinalPrice(order);
    order.setCompleted(true);
    orderRepository.save(order);

    // could send email (more order finalization tasks)

    return "redirect:/orders";
  }

  @RequestMapping(value = "/{orderId}/review", method = RequestMethod.GET)
  public String orderPostReview(ModelMap model, HttpServletRequest request, @PathVariable Long orderId) {
    Order order = orderRepository.findById(orderId).orElse(null);
    evaluateFinalPrice(order);
    model.put("order", order);
    model.put("toppings", toppingRepository.findAll());
    model.put("pizzaTypes", PizzaTypeEnum.values());
    model.put("pizzaSides", Side.values());
    return "review-order";
  }

  private void evaluateFinalPrice(Order order) {
    Double finalPrice = 0.0;
    for (Pizza pizza : order.getPizzas()) {
      finalPrice += pizza.getPrice();
    }
    order.setFinalPrice(finalPrice);
  }

}

