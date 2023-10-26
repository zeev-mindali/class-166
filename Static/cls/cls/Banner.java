package Static.cls.cls;

public class Banner {

        private Banner(){}
        private static final String RED_ALERT ="" +
                " *******   ******** *******             **     **       ******** *******   ********** ** **\n" +
                "/**////** /**///// /**////**           ****   /**      /**///// /**////** /////**/// /**/**\n" +
                "/**   /** /**      /**    /**         **//**  /**      /**      /**   /**     /**    /**/**\n" +
                "/*******  /******* /**    /**        **  //** /**      /******* /*******      /**    /**/**\n" +
                "/**///**  /**////  /**    /**       **********/**      /**////  /**///**      /**    /**/**\n" +
                "/**  //** /**      /**    **       /**//////**/**      /**      /**  //**     /**    // // \n" +
                "/**   //**/********/*******        /**     /**/********/********/**   //**    /**     ** **\n" +
                "//     // //////// ///////         //      // //////// //////// //     //     //     // // ";

        private static final String MY_CLASS="" +
                "                                                              \n" +
                "   ___    _        _____    _____       ___   _____    _____  \n" +
                " _(___)_ (_)      (_____)  (_____)     (___) (_____)  (_____) \n" +
                "(_)   (_)(_)     (_)___(_)(_)___      (_)(_)(_)___   (_)___   \n" +
                "(_)    _ (_)     (_______)  (___)_       (_)(_____)_ (_____)_ \n" +
                "(_)___(_)(_)____ (_)   (_)  ____(_)      (_)(_)___(_)(_)___(_)\n" +
                "  (___)  (______)(_)   (_) (_____)       (_) (_____)  (_____) \n" +
                "                                                              \n" +
                "                                                              ";

        public static String getAlert(){
                return RED_ALERT;
        }

        public static String getMyClass(){
                return MY_CLASS;
        }

        /*
                usa     : 10/26/2023  mm/dd/yyyy
                israel  : 26/10/2023  dd/mm/yyyy
         */

        //  10/26/2023->26/10/2023
        // split (char) -> array char -> [0]=>10 , [1]=>26 , [2]=>2023
        public static String convertDate(String userDate){
                String[] newDate = userDate.split("/");
                return newDate[1]+"/"+newDate[0]+"/"+newDate[2];
        }

        //26/10/2023=>10/26/2023
//        public static String israel2usa(String userDate){
//               String[] newDate = userDate.split("/");
//               return newDate[1]+"/"+newDate[0]+"/"+newDate[2];
//        }


}
