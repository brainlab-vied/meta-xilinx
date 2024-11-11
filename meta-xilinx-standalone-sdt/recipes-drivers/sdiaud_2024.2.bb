
inherit features_check

REQUIRED_MACHINE_FEATURES = "sdiaud"

inherit esw python3native

DEPENDS += "xilstandalone "

ESW_COMPONENT_SRC = "/XilinxProcessorIPLib/drivers/sdiaud/src/"
ESW_COMPONENT_NAME = "libsdiaud.a"

addtask do_generate_driver_data before do_configure after do_prepare_recipe_sysroot
do_prepare_recipe_sysroot[rdeptask] = "do_unpack"
