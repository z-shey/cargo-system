<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content" id="dashboard_index">
    <div class="info-container item">
        <div class="info-content" style="height: 400px;">

            <div id="container" style="height: 100%"></div>

            <script type="text/javascript">
                var dom = document.getElementById('container');
                var myChart = echarts.init(dom, null, {
                    renderer: 'canvas',
                    useDirtyRect: false
                });
                var app = {};

                var option;

                option = {
                    tooltip: {
                        trigger: 'item'
                    },
                    legend: {
                        top: '5%',
                        left: 'center'
                    },
                    series: [
                        {
                            name: '用户数量',
                            type: 'pie',
                            radius: ['40%', '70%'],
                            avoidLabelOverlap: false,
                            itemStyle: {
                                borderRadius: 10,
                                borderColor: '#fff',
                                borderWidth: 2
                            },
                            label: {
                                show: false,
                                position: 'center'
                            },
                            emphasis: {
                                label: {
                                    show: true,
                                    fontSize: 40,
                                    fontWeight: 'bold'
                                }
                            },
                            labelLine: {
                                show: false
                            },
                            data: [
                                {value: 1048, name: 'Search Engine'},
                                {value: 735, name: 'Direct'},
                                {value: 580, name: 'Email'}
                            ]
                        }
                    ]
                };

                if (option && typeof option === 'object') {
                    myChart.setOption(option);
                }

                window.addEventListener('resize', myChart.resize);
            </script>
        </div>
    </div>
</div>
