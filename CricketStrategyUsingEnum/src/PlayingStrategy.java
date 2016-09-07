
/**
 * Created by user-2 on 7/9/16.
 */
 enum PlayingStrategy {

    T20_STYLE {
        @Override
        public String play(){
            return "Playing offensively";
        }
    },
    TEST_STYLE {
        @Override
        public String play(){
            return "Playing defensively";
        }
    },
    ONEDAY_STYLE {
        @Override
        public String play(){
            return "Playing both offensively and defensively";
        }
    };

    abstract public String play();
    }