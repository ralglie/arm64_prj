# Copyright (C) 2022 The Qt Company Ltd.
# SPDX-License-Identifier: LicenseRef-Qt-Commercial OR BSD-3-Clause

cmake_minimum_required(VERSION 3.16)
project(webenginebrowser LANGUAGES CXX)

set(CMAKE_AUTOMOC ON)
set(CMAKE_AUTOUIC ON)

find_package(Qt6 REQUIRED COMPONENTS Core Gui WebEngineWidgets)

qt_add_executable(webenginebrowser
    browser.cpp browser.h
    browserwindow.cpp browserwindow.h
    certificateerrordialog.ui
    downloadmanagerwidget.cpp downloadmanagerwidget.h downloadmanagerwidget.ui
    downloadwidget.cpp downloadwidget.h downloadwidget.ui
    main.cpp
    passworddialog.ui
    tabwidget.cpp tabwidget.h
    webpage.cpp webpage.h
    webpopupwindow.cpp webpopupwindow.h
    webview.cpp webview.h
    webauthdialog.cpp webauthdialog.h webauthdialog.ui
)

target_link_libraries(webenginebrowser PUBLIC
    Qt::Core
    Qt::Gui
    Qt::WebEngineWidgets
    msgtool
)

# Resources:
set(webenginebrowser_resource_files
    "data/AppLogoColor.png"
    "data/ninja.png"
)

qt_add_resources(webenginebrowser "webenginebrowser"
    PREFIX
        "/"
    BASE
        "data"
    FILES
        ${webenginebrowser_resource_files}
)

set(webenginebrowser1_resource_files
    "data/3rdparty/dialog-error.png"
    "data/3rdparty/edit-clear.png"
    "data/3rdparty/go-bottom.png"
    "data/3rdparty/go-next.png"
    "data/3rdparty/go-previous.png"
    "data/3rdparty/process-stop.png"
    "data/3rdparty/text-html.png"
    "data/3rdparty/view-refresh.png"
)

qt_add_resources(webenginebrowser "webenginebrowser1"
    PREFIX
        "/"
    BASE
        "data/3rdparty"
    FILES
        ${webenginebrowser1_resource_files}
)

install(TARGETS webenginebrowser
    BUNDLE DESTINATION .
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
)
