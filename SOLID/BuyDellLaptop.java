class BuyDellLaptop implements BuyableLaptop{
    @Override
    public Specification buyLaptop(){
        LaptopSpecification myDellLap = new LaptopSpecification();
            myDellLap.add(new Dell());
            return myDellLap;
    }
}

