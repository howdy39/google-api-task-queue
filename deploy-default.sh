#!/bin/sh

# appengine-web.xmlを更新
cp src/main/webapp/WEB-INF/appengine-web.default.xml src/main/webapp/WEB-INF/appengine-web.xml

# デプロイ
mvn appengine:update
