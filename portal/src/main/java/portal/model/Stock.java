package portal.model;

import java.util.Date;

public class Stock {
	
	private String symbol;			//종목코드
	private Date day;				//날짜 및 시간
	private String countryCode;		//국가 코드
	private double price;			//현재가
	private double prechange;		//대비
	private double rate;			//등락률
	private double volume;			//거래량
	private double value;			//거래대금
	private double otclose;			//시간외종가
	private double otclosePrechange;//시간외종가 대비
	private double otcloseRate;		//시간외종가 등락률
	private double otcloseVolume;	//시간외종가 거래량
	private double otcloseValue;	//시간외종가 거래대금
	private double open;			//시가
	private double high;			//고가
	private double low;				//저가
	private double preclose;		//전일종가
	private double upLimit;			//상한가
	private double dnLimit;			//하한가
	private double recPrice;		//기준가
	private Date listedDay;			//상장일
	private double listedStock;		//상장주식
	private double marketCap;		//시가총액
	private double marketCapRate;	//시가총액비중
	private String idxCode;			//업종코드
	private double frnRate;			//외국인 보유 지분율(코스콤)
	private double preFrnRate;		//외국인 보유 지분율(체크단말)
	private double frnRateChange;	//외국인 보유 지분율 대비
	private double frnTotValue;		//외국인 보유 총액
	private double hisHighFrnRate;	//역대 최고 외국인 보유율
	private double hisLowFrnRate;	//역대 최저 외국인 보유율
	private double hisHigh;			//역대 최고가
	private double hisLow;			//역대 최저가
	private double subPrice;		//대용가
	private double roe;				//ROE
	private double per;				//PER
	private double pbr;				//PBR

    public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrechange() {
		return prechange;
	}
	public void setPrechange(double prechange) {
		this.prechange = prechange;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getOtclose() {
		return otclose;
	}
	public void setOtclose(double otclose) {
		this.otclose = otclose;
	}
	public double getOtclosePrechange() {
		return otclosePrechange;
	}
	public void setOtclosePrechange(double otclosePrechange) {
		this.otclosePrechange = otclosePrechange;
	}
	public double getOtcloseRate() {
		return otcloseRate;
	}
	public void setOtcloseRate(double otcloseRate) {
		this.otcloseRate = otcloseRate;
	}
	public double getOtcloseVolume() {
		return otcloseVolume;
	}
	public void setOtcloseVolume(double otcloseVolume) {
		this.otcloseVolume = otcloseVolume;
	}
	public double getOtcloseValue() {
		return otcloseValue;
	}
	public void setOtcloseValue(double otcloseValue) {
		this.otcloseValue = otcloseValue;
	}
	public double getOpen() {
		return open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getPreclose() {
		return preclose;
	}
	public void setPreclose(double preclose) {
		this.preclose = preclose;
	}
	public double getUpLimit() {
		return upLimit;
	}
	public void setUpLimit(double upLimit) {
		this.upLimit = upLimit;
	}
	public double getDnLimit() {
		return dnLimit;
	}
	public void setDnLimit(double dnLimit) {
		this.dnLimit = dnLimit;
	}
	public double getRecPrice() {
		return recPrice;
	}
	public void setRecPrice(double recPrice) {
		this.recPrice = recPrice;
	}
	public Date getListedDay() {
		return listedDay;
	}
	public void setListedDay(Date listedDay) {
		this.listedDay = listedDay;
	}
	public double getListedStock() {
		return listedStock;
	}
	public void setListedStock(double listedStock) {
		this.listedStock = listedStock;
	}
	public double getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}
	public double getMarketCapRate() {
		return marketCapRate;
	}
	public void setMarketCapRate(double marketCapRate) {
		this.marketCapRate = marketCapRate;
	}
	public String getIdxCode() {
		return idxCode;
	}
	public void setIdxCode(String idxCode) {
		this.idxCode = idxCode;
	}
	public double getFrnRate() {
		return frnRate;
	}
	public void setFrnRate(double frnRate) {
		this.frnRate = frnRate;
	}
	public double getPreFrnRate() {
		return preFrnRate;
	}
	public void setPreFrnRate(double preFrnRate) {
		this.preFrnRate = preFrnRate;
	}
	public double getFrnRateChange() {
		return frnRateChange;
	}
	public void setFrnRateChange(double frnRateChange) {
		this.frnRateChange = frnRateChange;
	}
	public double getFrnTotValue() {
		return frnTotValue;
	}
	public void setFrnTotValue(double frnTotValue) {
		this.frnTotValue = frnTotValue;
	}
	public double getHisHighFrnRate() {
		return hisHighFrnRate;
	}
	public void setHisHighFrnRate(double hisHighFrnRate) {
		this.hisHighFrnRate = hisHighFrnRate;
	}
	public double getHisLowFrnRate() {
		return hisLowFrnRate;
	}
	public void setHisLowFrnRate(double hisLowFrnRate) {
		this.hisLowFrnRate = hisLowFrnRate;
	}
	public double getHisHigh() {
		return hisHigh;
	}
	public void setHisHigh(double hisHigh) {
		this.hisHigh = hisHigh;
	}
	public double getHisLow() {
		return hisLow;
	}
	public void setHisLow(double hisLow) {
		this.hisLow = hisLow;
	}
	public double getSubPrice() {
		return subPrice;
	}
	public void setSubPrice(double subPrice) {
		this.subPrice = subPrice;
	}
	public double getRoe() {
		return roe;
	}
	public void setRoe(double roe) {
		this.roe = roe;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public double getPbr() {
		return pbr;
	}
	public void setPbr(double pbr) {
		this.pbr = pbr;
	}

}
