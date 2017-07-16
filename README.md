# GAEのタスクキューの使用例


# 事前準備
 JDK や Maven は以下のページを参照しインストールしておく  
[Java の App Engine スタンダード環境のクイックスタート  |  Java の App Engine スタンダード環境  |  Google Cloud Platform](https://cloud.google.com/appengine/docs/java/quickstart?hl=ja)

## コミットテンプレートの登録
```
git config commit.template .commit_template
```

# コマンド
## アプリケーションの起動
```
mvn appengine:devserver
```

## アプリケーションの更新
起動したままモジュールの更新が可能
```
mvn clean package
```

## アプリケーションのデプロイ
適宜`appengine-web.xml`を書き換えること
```
mvn appengine:update
```

