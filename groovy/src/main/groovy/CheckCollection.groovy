class CheckCollection extends  GroovyTestCase{
    def testPassportLength() {
        def list = new GetCollection().getCollection();
        def checkPassportLength = {assert it.passportId.length() > 2 : "PassportId shoul be more then 2 symbols"};
        list.each(checkPassportLength);
    }
}