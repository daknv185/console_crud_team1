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
	public static final String MSG_MENU = "メニュー番号を入力してください：";

	//社員名検索
	public static final String FIND_BY_EMP_NAME = "社員名：";

	//部署ID検索
	public static final String FIND_BY_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";
	
	//社員登録
	
	//社員名
	public static final String REGIST_EMP_NAME = "社員名：";
	//性別
	public static final String REGIST_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	//生年月日
	public static final String REGIST_BIRTHDAY = "生年月日(西暦年/月/日):";
	//部署ID
	public static final String REGIST_DEPT = "部署ID(1:営業部、2:経理部、3:総務部):";
	
	//社員情報更新
	public static final String UPDATE_EMP_ID_INPUT = "更新する社員の社員IDを入力してください：";
	
	public static final String UPDATE_HAS_BEEN_COMPLETED = "社員情報を更新しました";
	
	//社員情報削除
	public static final String DELETE_EMP_ID_INPUT = "削除する社員の社員IDを入力してください：";
	
	//システム終了
	public static final String MSG_END = "システムを終了します。";
	//検索結果が0件だった場合
	public static final String MSG_NOT_FOUND = "該当者はいませんでした";
	//全件検索 カラム
	public static final String FIND_ALL_COLUMN = "社員ID\t社員名\t性別\t生年月日\t部署名";
	
	//検索結果
	
	
}
