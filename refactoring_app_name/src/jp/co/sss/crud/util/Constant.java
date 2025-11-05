package jp.co.sss.crud.util;

public class Constant {

	/** インスタンス化を禁止 */
	private Constant() {
	}
	
	//メニュー用
	
	//メニュータイトル ヘッダー
	public static final String TITLE_HEADER = "=== 社員管理システム ===";
	
	//メニュー 全件表示
	public static final String TITLE_FIND_ALL = "1.全件表示";
	
	//メニュー 社員名検索
	public static final String TITLE_FIND_BY_EMP_NAME = "2.社員名検索";
	
	//メニュー 部署ID検索
	public static final String TITLE_FIND_BY_DEPT_ID = "3.部署ID検索";
	
	//メニュー 新規登録
	public static final String TITLE_REGIST = "4.新規登録";
	
	//メニュー 更新
	public static final String TITLE_UPDATE = "5.更新";
	
	//メニュー 削除
	public static final String TITLE_DELETE = "6.削除";
	
	//メニュー 終了
	public static final String TITLE_END = "7.終了";
	
	//メニュー 入力誘導
	public static final String TITLE_MENU = "メニュー番号を入力してください：";

	//社員名検索
	public static final String FIND_BY_EMP_NAME = "社員名：";

	//部署ID検索
	public static final String FIND_BY_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";
	
	//社員登録
	
	//社員名
	public static final String REGIST_EMP_NAME = "社員名：";
	//性別
	public static final String REGIST_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	//社員名
	public static final String REGIST_BIRTHDAY = "生年月日(西暦年/月/日):";
	//社員名
	public static final String REGIST_DEPT = "部署ID(1:営業部、2:経理部、3:総務部):";
}
