package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is code for a coffee shop which sells three products coffee ,bagels , donuts which has four classes one for
 * customer and rest three for coffee , bagels and donuts
 *
 * @author Amritpal Singh
 *
 * @version 1.1
 */

class Product{

    private String productName;
    static protected   double cost ;
    private double cash;

    /**
     * getter method for cash
     * @return returns the cash
     */

    public double getCash() {
        return cash;
    }

    /**
     * set method for cash
     * @param cash sets the value of cash
     */
    public void setCash(double cash) {
        this.cash = cash;
    }

    /**
     * get method for productName
     * @return productName
     */

    public String getProductName() {
        return productName;
    }

    /**
     * set method for productName
     * @param productName sets productName
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * getter method for cost
     * @return returns the cost
     */
    public double getCost(){
        return cost;
    }

    /**
     * Constructor for product class which takes productName, cost and cash as a parameter
     * @param productName attribute productName
     * @param cost     attribute cost
     * @param cash     attribute cash
     */

    public Product(String productName,double cost,double cash){
        this.productName = productName;
        this.cost = cost;
        this.cash = cash;
    }
}

/**
 * Coffee class inheriting attributes of  product class
 */

class Coffee extends Product{

    private int numOfCream;
    private int numOfSugar;
    private int numOfCoffees;

    /**
     * getter method for number of cups of coffee
     * @return number of cups of coffee
     */
    public int getNumOfCoffees() {
        return numOfCoffees;
    }

    /**
     * setter method for setting number of cups of coffee
     * @param numOfCoffees sets number of coffee cups
     */

    public void setNumOfCoffees(int numOfCoffees) {
        this.numOfCoffees = numOfCoffees;
    }

    /**
     * getter method for getting number of cream spoon needed in coffee
     * @return  returns numOfCream
     */

    public int getNumOfCream() {
        return numOfCream;
    }

    /**
     * setter method for setting value of number of creams
     * @param numOfCream sets the value for number of cream
     */

    public void setNumOfCream(int numOfCream) {
        this.numOfCream = numOfCream;
    }

    /**
     * getter method for getting number of sugar spoons needed
     * @return returns numOfSugar
     */

    public int getNumOfSugar() {
        return numOfSugar;
    }

    /**
     * setter method for setting value of numOfSugar
     * @param numOfSugar sets value of numOfSugar
     */

    public void setNumOfSugar(int numOfSugar) {
        this.numOfSugar = numOfSugar;
    }

    /**
     * Constructor for class Coffee which takes productName,cost,cash,numOfcream,numOfSugar as parameter
     * @param productName takes productName as parameter
     * @param cost cost of coffee
     * @param cash cash a person is having
     * @param numOfCream number of cream spoons
     * @param numOfSugar number of sugar spoons
     */
    public Coffee(String productName,double cost,double cash,int numOfCream,int numOfSugar){
        super(productName,cost,cash);
        this.numOfCream=numOfCream;
        this.numOfSugar=numOfSugar;
    }

    /**
     * static method which returns number of coffee cups a person can purchase with the cash he is having
     * @param cash  method how many coffee takes cash as a parameter
     * @return return number of coffee cups
     */
    static int howManyCoffees(double cash){
        int numOfCoffee = (int) (cash/cost);
        return numOfCoffee;
    }
}


class Bagels extends Product{

    private boolean toasted;
    private boolean creamCheese;
    private boolean butter;
    private int numOfBagels;

    /**
     *  getter method for number of begals
     * @return number of bagels
     */

    public int getNumOfBagels() {
        return numOfBagels;
    }

    /**
     * setter method for setting number of begals
     * @param numOfBagels  sets number of begals
     */

    public void setNumOfBagels(int numOfBagels) {
        this.numOfBagels = numOfBagels;
    }

    /**
     * Constructor for class bagels
     * @param productName it's the name of product
     * @param cost it's the cost of the begals
     * @param cash cash the person is having
     * @param toasted parameter for if begal is tosted
     * @param creamCheese paramter for cream cheese
     * @param butter paramter for if it has butter
     */

    public Bagels(String productName, double cost,double cash,boolean toasted,boolean creamCheese,boolean butter) {
        super(productName, cost,cash);
        this.toasted = toasted;
        this.creamCheese = creamCheese;
        this.butter = butter;
    }

    /**
     *
     * @return returns is bagel is tosted
     */
    public boolean isToasted() {
        return toasted;
    }

    /**
     *
     * @param toasted takes value if bagel is tosted
     */
    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isCreamCheese() {
        return creamCheese;
    }

    public void setCreamCheese(boolean creamCheese) {
        this.creamCheese = creamCheese;
    }

    public boolean isButter() {
        return butter;
    }

    public void setButter(boolean butter) {
        this.butter = butter;
    }

    static int howManyBagels(double cash){
        int numOfBegals = (int)(cash/cost);
        return numOfBegals;
    }

}

/**
 * class donuts inheriting products
 */

class Donuts extends Product{
    private int numOfDonuts;

    public int getNumOfDonuts() {
        return numOfDonuts;
    }

    public void setNumOfDonuts(int numOfDonuts) {
        this.numOfDonuts = numOfDonuts;
    }

    /**
     *
     * @param productName it's the name of the product
     * @param cost cost of the item
     * @param cash cash the person is having
     * @param numOfDonuts number of donuts
     */

    public Donuts(String productName, double cost,double cash,int numOfDonuts) {
        super(productName, cost,cash);
        this.numOfDonuts = numOfDonuts;
    }

    static int howManyDonuts(double cash){
        int numOfDonuts = (int)(cash/cost);
        return numOfDonuts;
    }
}

class Customer{
    private String name;
    private double balance;
    List<String>productList = new ArrayList<String>();

    /**
     *
     * @param name name of the item
     * @param balance balance a customer is having
     * @param productList list of items
     */

    public Customer(String name, double balance, List<String> productList) {
        this.name = name;
        this.balance = balance;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * method which adds the item to the cart
     * @param name name of item which is taken as parameter in method add to cart
     * @return returns list of items if balance more than 5 else an error message
     */

    public String addToCart(String name){
        if(balance>5){
            productList.add(name);
            System.out.println("Success");
        }
        return "Warning: Low Balance";
    }

    /**
     * this method displays the item in the cart
     * @return returns the number of items in the cart
     */
    public int  displayCart(){
        for(String products:productList){
            System.out.println(products);
        }
        return productList.size();
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        Customer c = new Customer("Coffee",10.5, Collections.singletonList("Coffee"));
        c.addToCart("Begals");
        Coffee co = new Coffee("Coffee",1.50,10,2,3);
        co.getNumOfCoffees();

    }
}
