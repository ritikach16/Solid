class BuyHpLaptop implements BuyableLaptop{
    @Override
    public Specification buyLaptop(){
        LaptopSpecification myHpLap = new LaptopSpecification();
        myHpLap.add(new Hp());
        return myHpLap;
    }
}