public class Main {
    public static void main(String[] args) {

        Iphone iphone9 = IphoneFactory.criarIphone(TypeIphoneEnum.IPHONE_9);
        System.out.println(iphone9.exibirDetalhes());

        Iphone iphoneX = IphoneFactory.criarIphone(TypeIphoneEnum.IPHONE_X);
        System.out.println(iphoneX.exibirDetalhes());

        Iphone iphone13mini = IphoneFactory.criarIphone(TypeIphoneEnum.IPHONE_13_MINI);
        System.out.println(iphone13mini.exibirDetalhes());

    }
}