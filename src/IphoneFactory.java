public class IphoneFactory {

    public static Iphone criarIphone (TypeIphoneEnum type){
        if (type.equals(TypeIphoneEnum.IPHONE_9)){
            return new Iphone9();
        } else if (type.equals(TypeIphoneEnum.IPHONE_X)) {
            return new IphoneX();
            
        } else if (type.equals(TypeIphoneEnum.IPHONE_13_MINI)) {
            return new Iphone13Mini();

        }
        throw new IllegalArgumentException("Não produzimos esse modelo de Iphone");
    }

}
