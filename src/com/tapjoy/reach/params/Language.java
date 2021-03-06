package com.tapjoy.reach.params;
public enum Language {
	English("EN"), Spanish("ES"), French("FR"), German("DE"), Dutch("NL"), Japanese(
			"JA"), Korean("KO"), Chinese("ZH"), Simplified_Chinese("zh-Hans") {
		@Override
		public String toString() {
			return "Simplified Chinese";
		}
	},
	Traditional_Chinese("zh-Hant") {
		@Override
		public String toString() {
			return "Traditional Chinese";
		}
	},
	Russian("RU");

	private String keyword;

	private Language(String code) {
		this.keyword = code;
	}
	
	public static Language getEnum(String val){
		for(Language key: Language.values()){
			if(key.keyword.equalsIgnoreCase(val)){
				return key;
			}
		}
		return null;
	}
	
	public String getKeyword(){
		return this.keyword;
	}
}
