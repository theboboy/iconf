# iconf-core
环境/机房 -> 项目/应用 -> 版本 -> 配置

项目/应用 -> 子项目/应用 版本自动继承

配置
  |
  +-->配置组/配置文件
  |
  +-->配置项/单独配置

配置组/配置文件
  组名称
  配置集合

配置项/单独配置
  配置键
  配置值
  配置类型 string(默认) int long double decimal array<string> array<int> array<long> array<double> array<decimal> json
  配置版本 用于快速回滚

初期先不考虑人 角色 审批 等