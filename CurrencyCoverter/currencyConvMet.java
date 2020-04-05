

public class currencyConvMet
{

    public float usa(int amount){
        float usdRate = 0.0082f;
        float nrs = amount * usdRate;
        return nrs;
    }

    public float canada(int amount){
        float nrs;
        nrs = amount * 0.012f;
        return nrs;
    }

    public float uk(int amount){
        float nrs;
        nrs = amount * 0.0067f;
        return nrs;
    }

    public float india(int amount){
        float nrs;
        nrs = amount * 0.63f;
        return nrs;
    }

    public float australia(int amount){
        float nrs;
        nrs = amount * 0.014f;
        return nrs;
    }

    public float china(int amount){
        float nrs;
        nrs = amount * 0.058f;
        return nrs;
    }
}
