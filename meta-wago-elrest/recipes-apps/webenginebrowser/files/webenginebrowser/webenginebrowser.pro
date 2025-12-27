TEMPLATE = app
TARGET = webenginebrowser
QT += webenginewidgets

HEADERS += \
    browser.h \
    browserwindow.h \
    downloadmanagerwidget.h \
    downloadwidget.h \
    tabwidget.h \
    webpage.h \
    webpopupwindow.h \
    webview.h \
    webauthdialog.h

SOURCES += \
    browser.cpp \
    browserwindow.cpp \
    downloadmanagerwidget.cpp \
    downloadwidget.cpp \
    main.cpp \
    tabwidget.cpp \
    webpage.cpp \
    webpopupwindow.cpp \
    webview.cpp \
    webauthdialog.cpp

FORMS += \
    certificateerrordialog.ui \
    passworddialog.ui \
    downloadmanagerwidget.ui \
    downloadwidget.ui \
    webauthdialog.ui

RESOURCES += data/webenginebrowser.qrc

# install
INSTALLS += target
