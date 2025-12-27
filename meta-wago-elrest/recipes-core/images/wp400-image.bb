SUMMARY = "WP400 panel image"

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

# inherit works for classes
inherit core-image

# or use require <recipes>
require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += " \
  ssh-server-dropbear \
  ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '', \
     bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11-base', \
                                                       '', d), d)} \
  debug-tweaks \
  tools-testapps \
  tools-profile \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-fsl-tools-benchmark \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', \
                         'firmwared', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', \
                         'weston weston-init', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', \
                         'weston-xwayland xterm', '', d)} \
    evtest \
    fbset \
    i2c-tools \
    yoctoqt6demo \
    qtwayland \
    qtwebengine \
    qtkeyboard \
    squeekboard \
"

ACCEPT_FSL_EULA = "1"

DISTRO_FEATURES:append = " x11 wayland"

########################################################################
#SUMMARY = "WP400 panel debug image"

#inherit core-image
#require wp400-image.bb

#IMAGE_FEATURES += " \
#  tools-debug \
#"

#CORE_IMAGE_EXTRA_INSTALL += "ethtool evtest fbset i2c-tools memtester"


########################################################################
