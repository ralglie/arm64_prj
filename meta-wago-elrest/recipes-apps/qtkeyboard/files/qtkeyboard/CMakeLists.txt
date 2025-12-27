cmake_minimum_required(VERSION 3.16)
project(qtkeyboard LANGUAGES CXX)

set(CMAKE_AUTOMOC ON)
set(CMAKE_AUTOUIC ON)

find_package(Qt6 REQUIRED COMPONENTS Core Gui)
#find_package(QT NAMES Qt6 REQUIRED COMPONENTS Core)
#find_package(Qt${QT_VERSION_MAJOR} REQUIRED COMPONENTS Gui)

qt_add_executable(qtkeyboard
    main.cpp
    cmdthread.cpp cmdthread.cpp
)

target_link_libraries(qtkeyboard PUBLIC
    Qt::Core
    Qt::Gui
)

install(TARGETS qtkeyboard
    BUNDLE DESTINATION .
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
)
