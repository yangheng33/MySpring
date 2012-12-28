var area_1=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-style": {
				"type":"anchor",
				"sides":3,
				"width":1,
				"tip":"type = anchor\nsides = 3\nhollow" },
      "values" : [
		0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,
		1.89,1.85,1.72,1.53,1.28,0.97,0.63,
		{"value" :0.26, "type":"star", "colour":"#FF0000", "dot-size":10},
		-0.11,-0.48,-0.84,-1.16,-1.43,
		-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],
  
  "y_axis":{
    "min": -2,
    "max": 2
  }
};

var area_line_dash=
{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "mid-slide", "cascade":1, "delay":0.5}
		}
	]
}
;
var area_line=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "tip":       "Hello<br>#val#",
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],

  "x_axis":{
    "ma--x":30,
    "labels": {
      "labels": ["0.00","0.38","0.74","1.07","1.36","1.60","1.77","1.87","1.90","1.85","1.73","1.54",
              "1.28","0.98","0.64","0.27","-0.11","-0.49","-0.84","-1.16","-1.44","-1.66","-1.81",
              "-1.89","-1.89","-1.82","-1.68","-1.47","-1.20","-0.88"]
    }
  },

  "y_axis":{
    "min": -2,
    "max": 2
  }
}
;
var area_point_objects=
{
"elements": [
	{
		"type": "area",
		"fill-alpha": 0.4,
		"values": [
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "October 2007 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "November 2007 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "December 2007 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "January 2008 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "February 2008 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 0,
			"colour": "#D02020",
			"tip": "March 2008 Search Rank<br>Rank 0 \/ 100"
			},
			{
			"value": 83,
			"colour": "#D02020",
			"tip": "April 2008 Search Rank<br>Rank 83 \/ 100"
			},
			{
			"value": 76,
			"colour": "#D02020",
			"tip": "May 2008 Search Rank<br>Rank 76 \/ 100"
			},
			{
			"value": 100,
			"colour": "#D02020",
			"tip": "June 2008 Search Rank<br>Rank 100 \/ 100"
			},
			{
			"value": 80,
			"colour": "#D02020",
			"tip": "July 2008 Search Rank<br>Rank 80 \/ 100"
			},
			{
			"value": 73,
			"colour": "#D02020",
			"tip": "August 2008 Search Rank<br>Rank 73 \/ 100"
			},
			{
			"value": 100,
			"colour": "#D02020",
			"tip": "September 2008 Search Rank<br>Rank 100 \/ 100"
			}
		],
		"width": 2,
		"dot-size": 4,
		"halo-size": 2,
		"colour": "#ff9900",
		"fill": "#dbecf6"
	}
	],
	"bg_colour": "#ffffff",
	"x_axis": {
		"colour": "#aaaaaa",
		"grid-colour": "#eeeeee",
		"stroke": 1,
		"tick-height": 4,
		"labels": {
			"labels": [
				"Oct",
				"Nov",
				"Dec",
				"Jan",
				"Feb",
				"Mar",
				"Apr",
				"May",
				"Jun",
				"Jul",
				"Aug",
				"Sep"
			]
		}
	},
	"y_axis": {
		"colour": "#aaaaaa",
		"grid-colour": "#eeeeee",
		"stroke": 1,
		"tick-length": 5,
		"min": 0,
		"max": 105,
		"steps": 50
	},
	"tooltip": {
		"stroke": 1,
		"colour": "#000000",
		"background": "#fffbca"
	}
};

var bar_2=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
      "values" :   [4,9,6,7,9,5,7,6,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }
};
var bar_3d_2_BUG=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_3d",
      "alpha":     0.8,
      "colour":    "#9933CC",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#A03030","tip":"#top#<br>hello"},6,9,7]
    },
    {
      "type":      "bar_3d",
      "alpha":     0.8,
      "colour":    "#f00000",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#A03030","tip":"#top#<br>#x_label#"},6,9,7]
    }
  ],

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    },
    "3d":         5
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }
};
var bar_3d=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_3d",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#A03030","tip":"#top#<br>hello"},6,9,7]
    }
  ],

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    },
    "3d":         5
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }

/* &x_axis_steps=2& */

}

;
var bar_4=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#A03030","tip":"#top#<br>hello"},6,null,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
      "values" :   [4,9,6,7,9,5,7,6,9]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC0000",
      "text":      "XXX",
      "font-size": 10,
      "values" :   [6,7,9,5,7,6,9,5,5]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }

/* &x_axis_steps=2& */

}

;
var bar_all_onclick=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_sketch",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_glass",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_3d",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_filled",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_cylinder",
      "colour":    "#9933CC",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_cylinder_outline",
      "colour":    "#3030FF",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_round_glass",
      "colour":    "#CC0000",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_round",
      "colour":    "#CC0000",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_dome",
      "colour":    "#CCCC00",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_plastic",
      "colour":    "#CCCC00",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    },
    {
      "type":      "bar_plastic_flat",
      "colour":    "#CCCC00",
      "on-click":  "trace:http://example.com",
      "values" :   [{"top":7, "on-click":  "trace:http://google.com"},0,-7]
    }
  ],

  "y_axis":{
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "min":         -10,
    "max":         10
  }
}

;
var bar_alpha=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "alpha":     0.5,
      "values" :   [9]
    },
    {
      "type":      "bar_cylinder_outline",
      "colour":    "#CC9933",
      "alpha":     0.9,
      "values" :   [{"top":7,"colour":"#30A030","tip":"#top#<br>hello"}]
    },
    {
      "type":      "bar_cylinder_outline",
      "colour":    "#CC9933",
      "alpha":     0.9,
      "values" :   [{"top":7,"colour":"#A03030","tip":"#top#<br>hello","alpha":0.2}]
    },
    {
      "type":      "bar_sketch",
      "colour":    "#0000FF",
      "alpha":     0.5,
      "values" :   [4]
    },
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "values" :   [6]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }
}

;
var bar_cylinder=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_cylinder",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [5,{"top":7,"colour":"#A03030","tip":"#top#<br>hello"},-6,null,7]
    },
    {
      "type":      "bar_cylinder_outline",
      "alpha":     0.7,
      "colour":    "#3030FF",
      "text":      "Page views 2",
      "font-size": 10,
      "values" :   [4,9,9,-6,9]
    },
    {
      "type":      "bar_round_glass",
      "alpha":     0.7,
      "colour":    "#CC0000",
      "values" :   [6,5,7,-5]
    },
    {
      "type":      "bar_round",
      "alpha":     0.7,
      "colour":    "#CC0000",
      "values" :   [6,5,7,-5]
    },
    {
      "type":      "bar_dome",
      "alpha":     0.7,
      "colour":    "#CCCC00",
      "values" :   [6,-5,5,7]
    },
    {
      "type":      "bar_round3d",
      "alpha":     0.7,
      "colour":    "#CCCC00",
      "values" :   [6,-5,5,7]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "min":         -10,
    "max":         20
  }

/* &x_axis_steps=2& */

}

;
var bar_filled=
{
  "title":{
    "text":  "Filled",
    "style": "{font-size:35px; color: #567300}"
  },

  "elements":[
    {
      "type":            "bar_filled",
      "colour":          "#81AC00",
      "outline-colour":  "#567300",
      "values" :   [
        3,
        8,
null,
       -5,
        {"top":5,"outline-colour": "#7030A0", "tip": "outline"},
       4,
       {"top":5, "colour": "#99FF00", "tip": "colour"},
       {"top":-3,"colour": "#D08080", "outline-colour": "#FF0000", "tip": "colour + outline"},
       null,
       7.5]
    }
  ],

  "x_axis":{
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "min": -10,
    "max":  10
  },

  "tooltip":{
    "text": "My Tip<br>#top#,#bottom# = #val#"
  }

}

;
var bar_floating_2=
{
  "title": {
    "text": "Fri Jul 11 2008"
  },
  "elements": [
    {
      "type": "bar",
      "values": [
        130,
        180,
        200,
        {
          "top": 170
        },
        {
          "top": 130,
          "colour": "#000000",
          "tip": "Hello<br>#top#"
        },
        null,
        150
      ]
    },
    {
      "type": "bar_filled",
      "values": [
        140,
        190,
        180,
        140,
        {
          "top": 200,
          "bottom": 150,
"tip":"#top# - #bottom#"
        },
        160,
        130
      ],
      "colour": "#FFEF3F"
    }
  ],
  "bg_colour": "#FFFFFF",
  "y_axis": {
    "min": 100,
    "max": 200,
    "steps": 10
  }
}
;
var bar_floating=
{
  "title":{
    "text":  "Floating bars, -10 to 10",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,9,5,7,{"top":4,"bottom":-4,"tip":"LOOK<br>#top#,#bottom# = #val#"},-9,{"top":4,"bottom":-5}]
    }
  ],

  "x_axis":{
    "labels": ["January","February","March","April","May","June","July"]
   },

  "y_axis":{
    "min": 10,
    "max": -10
  },

  "tooltip":{
    "text": "My Tip<br>#top#,#bottom# = #val#"
  }

}

;
var bar_glass_2=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "tip":       "Tip for purple bars<br>val=#val#, top=#top#",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#FF0000", "tip": "RED<br>Mooo<br>#val#"},6,9,7]
    },
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#44FF44",
      "tip":       "Tip for green bars<br>val=#val#, top=#top#",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [6,7,9,5,9,{"top":7,"colour":"#FF0000", "tip": "RED<br>W000t<br>#val#"},6,5,2]
    }
  ],

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  },

  "tooltip":{
    "text": "Global Tooltip<br>val=#val#, top=#top#"
  }

/* &x_axis_steps=2& */

}

;
var bar_glass_height_0=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "tip":       "Tip for purple bars<br>val=#val#, top=#top#",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [9,6,7,0,5,{"top":7,"colour":"#FF0000", "tip": "RED<br>Mooo<br>#val#"},6,9,7]
    }
  ],

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  },

  "tooltip":{
    "text": "Global Tooltip<br>val=#val#, top=#top#"
  }

/* &x_axis_steps=2& */

}

;
var bar_glass=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text--":      "Page views",
      "font-size--": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#FF0000", "tip": "Mooo<br>#val#"},6,9,7]
    }
  ],

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  },

  "tooltip":{
    "text": "My Tip<br>val=#val#, top=#top#"
  }

/* &x_axis_steps=2& */

}

;
var bar_groups_with_nulls=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#A03030","tip":"#top#<br>hello"},6,null,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
      "values" :   [4,9,6,7,9,5,7,6,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick-height":10,
    "colour":"#d000d0",
    "grid-colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick-length": 3,
    "colour":      "#d000d0",
    "grid-colour": "#00ff00",
    "offset":      0,
    "max":         20
  }

/* &x_axis_steps=2& */

}

;
var bar_on_show_cascade=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#909090; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #909090; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
	  "on-show":	{"type": "pop", "cascade":1, "delay":2.5},
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
	  "on-show":	{"type": "drop", "cascade":0.9},
      "values" :   [4,9,6,7,9,5,7,6,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#909090",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#909090",
    "grid_colour": "#d0d0d0",
    "offset":      0,
    "max":         20
  }

/* &x_axis_steps=2& */

}

;
var bar_on_show_pop=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#909090; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #909090; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "b-ar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
	  "on-show":	{"type": "pop", "delay":0.5, "cascade":0.6},
      "values" :   [4,9,6,7,9,5,7,6,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#909090",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#909090",
    "grid_colour": "#d0d0d0",
    "offset":      0,
    "max":         20
  }
}

;
var bar_on_show=
{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#909090; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #909090; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
	  "on-show":	{"type": "grow-up"},
      "values" :   [4,9,6,7,9,5,7,6,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#909090",
    "grid_colour":"#00ff00",
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#909090",
    "grid_colour": "#d0d0d0",
    "offset":      0,
    "max":         20
  }
}

;
var bar_sketch=
{
  "title":{
    "text":  "Sketch",
    "style": "{font-size:35px; color: #567300}"
  },

  "elements":[
    {
      "type":            "bar_sketch",
      "colour":          "#81AC00",
      "outline-colour":  "#567300",
      "text":            "Sketch",
      "font-size":       10,
      "offset":          7,
      "values" :   [
        3,
        8,
       -5,
        {"top":5,"outline-colour": "#7030A0", "tip": "outline"},
       4,
       {"top":5, "colour": "#99FF00", "tip": "colour"},
       {"top":-3,"colour": "#99FF00", "outline-colour": "#7030A0", "tip": "colour + outline"},
       2,
       7.5]
    }
  ],

  "x_axis":{
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "min": -10,
    "max":  10
  },

  "tooltip":{
    "text": "My Tip<br>#top#,#bottom# = #val#"
  }

}

;
var bar_test_all=
﻿{

  "title":{
    "text":"Glass Bar Cart",
    "style":"{font-size:20px; color: #FFFFFF; margin: 5px; background-color: #505050; padding:5px 20px 5px 20px;}"
  },

  "elements":[
    {
      "type":      "bar_3d",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [10,-6]
    },
    {
      "type":      "bar_fade-",
      "colour":    "#3334AD",
      "text":      "Stuff",
      "font-size": 10,
      "values" :   [10,-10]
    },
    {
      "type":      "bar",
      "colour":    "#339966",
      "text":      "Green Bar",
      "font-size": 10,
      "values" :   [7,-7]
    },
    {
      "type":      "bar_glass",
      "colour":    "#339966",
      "text":      "Green Bar",
      "font-size": 10,
      "values" :   [10,-10]
    },
    {
      "type":      "bar_filled",
      "colour":    "#8822BB",
      "outline-colour": "#8010A0",
      "text":      "Outline",
      "font-size": 10,
      "values" :   [8,-8]
    }

  ],


  "x_axis":{
    "labels": { "labels" :["Jan","Feb"] },
    "3d":     5
  },

  "y_axis":{
    "min": -20,
    "max":  20
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#7E97A6;}"
  }
}

/*

&bg_colour=#E2E6E0&
&show_y2=true&
&y2_axis_colour=#164166&

&y2_label_style=10,0x164166&
&_y2_lines=2,4&


&y2_min=-10&
&y2_max=10&

&y2_legend=Free Ram (mb),12,0x164166&

&tool_tip=#x_legend#, € %25 #x_label#<br>#key#: £#val#.00<br>#val:time#&
&x_legend=2007,12,0x164166&

*/


;
var bug_1=
{
	"title": 
		{
			"text": "Tooltip Demo",
			"style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
		},
	"x_axis": 
		{
			"offset": false,
			"labels": 
				{
					"steps": 1
				},
			"steps": 1,
			"3d": 0
		},
	"y_axis": 
		{
			"tick-length": 0,
			"offset": 0,
			"steps": 5,
			"min": -10,
			"max": 15,
			"3d": 0
		},
	"elements": 
		[
			{
				"width": 2,
				"dot-size": 5,
				"halo-size": 3,
				"colour": "#456f3",
				"values": 
					[
						7,
						7.3774717285106162,
						7.7398948503864364,
						8.0728206994505669,
						8.3629765727090941,
						8.598794871135004,
						8.77087426333773,
						8.8723544869780735,
						8.89918984577886,
						8.8503104986685717,
						8.727665110968795,
						8.5361431672572223,
						8.2833800430471864,
						7.9794526064607822,
						7.6364774852962185,
						7.2681280153137466,
						6.8890891274875967,
						6.5144719061490193,
						6.1592111577397786,
						5.8374700072088324,
						5.5620752589149349,
						5.3440060324141818,
						5.191956059609919,
						5.1119870930964169,
						5.1072872432119034,
						5.1780438781400377,
						5.32143615413171,
						5.5317474736436267,
						5.8005933880425928,
						6.1172558591138655,
						6.4691105534220457
					],
				"text": "line1",
				"fillalpha": 0.35,
				"type": "line"
			}
		],
	"tooltip": 
		{
			"text": "global tooltip #val#"
		}
}
;
var candle=
{
  "title":{
    "text":  "Candle",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "candle",
      "alpha":     0.5,
      "colour":    "#40d040",
      "negative-colour":    "#d04040",
      "text":      "Burn baby, burn",
      "font-size": 10,
	  "on-show":	{"type": "po-p", "cascade":1, "delay":0},
      "tip":       "#x_label#<br>High: #high#<br>Open: #open#<br>Close: #close#<br>Low: #low#",
      "values" :   [
        {"high":19, "top":14, "bottom":11, "low":10, "tip":"LOOK<br>#top#,#bottom# = #val#"},
        {"high":15, "top":10, "bottom":5, "low":0},
        {"high":7, "top":7, "bottom":4, "low":3},
        {"high":7, "top":3, "bottom":6, "low":2},
        {"high":7, "top":4, "bottom":4, "low":2}
        ]
    }
  ],

  "x_axis":{
    "labels": ["January","February","March"]
   },

  "y_axis":{
    "max": 20
  }

}

;
var combined_chart_bar_line_scatter=
{
  "title":{
    "text":  "Request from user: TheBashar",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.7,
      "colour":    "#6D9934",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [169,166,167,169,165,167,166,169,167]
    },
   {
      "type": "line",
	  "dot-style": {"type":"solid-dot", "dot-size": 2, "halo": 1},
      "values": [ 190, 192, 193, 194, 192, 190, 192, 193, 194 ],
      "width": 2,
      "colour": "#A18B6A",
      "text": "S&P 500",
      "font-size": 12
    },
	{
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"star", "colour":"#DD0000", "hollow":false},
      "values" :   [
                     {"x":3.5,  "y":193, "tip":"HELLO" },
                     {"x":7, "y":190,  "dot-size":7}
                   ]
    },
	{
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"anchor", "sides":4, "rotation":45, "colour":"#6D9934", "hollow":false},
      "values" :   [
                     {"x":3,  "y":192},
					 {"x":3.2,  "y":192},
					 {"x":4,  "y":192},
					 {"x":4.5,  "y":192},
                     {"x":8, "y":190}
                   ]
    }
  ],
  
  "bg_colour": "#FAF7F5",

  "x_axis":{
    "stroke":1,
    "tick-length":2,
    "colour":"#696969",
    "grid-visible":false,
    "labels": ["10<br>January","15<br>Jan","March","April","May","June","July","August","Spetember"]
   },

  "y_axis":{
    "stroke":      1,
    "tick-length": 2,
    "colour":      "#696969",
    "grid-colour": "#B5B4B3",
    "offset":      0,
	"min":			160,
    "max":         200,
	"steps":		5
  },

  "tooltip":{
    "mouse": 1,
    "stroke":1
  }

}

;
var comparisons=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* December 28 - January 3 */
				5217,12957,13761,10001,4409,10737,6805
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* January 4 - January 10 */
				7265,15366,17295,17434,19908,18646,7590
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* January 11 - January 17 */
				8807,16022,19428,18060,19342,16441,9144
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* January 18 - January 24 */
				6987,18623,18234,18695,19463,18197,8038
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* January 25 - January 31 */
				7388,16279,17989,16972,17300,16900,8631
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* February 1 - February 7 */
				7630,15920,18820,19736,19877,19036,9498
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* February 8 - February 14 */
				8462,20963,21375,19958,20934,19418,7468
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* February 15 - February 21 */
				8156,18542,21337,22606,20517,19413,8287
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* February 22 - February 28 */
				7697,18689,19207,20320,18814,19901,8910
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* March 1 - March 7 */
				9208,19608,20342,22017,21121,21887,9295
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* March 8 - March 14 */
				10137,20351,22631,23537,22577,21766,8350
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* March 15 - March 21 */
				8615,21410,20658,21802,21743,19196,9142
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* March 22 - March 28 */
				9597,23737,25651,26392,24262,22219,10238
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* March 29 - April 4 */
				8986,23116,26447,26273,23800,22472,9885
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* April 5 - April 11 */
				9877,26088,27208,23224,23080,18266,10373
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* April 12 - April 18 */
				8749,19981,25231,25573,25301,22133,11443
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* April 19 - April 25 */
				9606,23534,26971,27599,28266,28851,14547
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* April 26 - May 2 */
				8536,23146,25804,23278,23338,11409,8987
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* May 3 - May 9 */
				9927,20798,23867,24617,22217,20556,9146
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* May 10 - May 16 */
				8655,21463,23547,24920,27221,22235,10928
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* May 17 - May 23 */
				9601,21913,25392,24938,22652,22858,9513
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* May 24 - May 30 */
				9423,22241,25194,24351,23348,23821,8379
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* May 31 - June 6 */
				10162,20333,28830,25407,24313,24205,10580
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* June 7 - June 13 */
				9726,24385,28695,25270,22878,21605,9805
		]},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"values" :   [
				/* June 14 - June 20 */
				9395,22256,26144,26589,26070,24894,10347
		]}
	],
	"x_axis":{
    "labels": {
      "rotate": "vertical",
      "labels":["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
    }
  },

  "y_axis":{
    "max":   30000
  }

}
;
var exp=
/*

https://sourceforge.net/forum/forum.php?thread_id=2131075&forum_id=716572

by brian hull

*/

{ "title": { "text": "Mitigating Systems Performance Index, High Pressure Injection System", "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}" }, "y_legend":{ "text":"Arkansas Nuclear 1", "style":"{font-size: 12px; color:#736AFF;}" }, "elements": [ { "type": "line_hollow", "fill_alpha": 0.5, "colour": "#9933CC", "text": "Thresholds: White > 1.00E-6 Yellow > 1.00E-5 Red > 1.00E-4 ", "font-size": 10, "values": [3.28,4.29,6.39,6.49,4.99,3.99,7.28,5.28] } ], "x_axis": { "labels": { "steps": 1, "rotate": "vertical", "colour": "#CF4D5F", "size": 16, "labels": [ "2Q/06","3Q/06","4Q/06","1Q/07","2Q/07","3Q/07","4Q/07","1Q/08" ] } }, "x_legend": { "text": "Original Values: 3.20E-08 4.20E-09 6.30E-09 6.40E-09 4.90E-09 3.90E-09 7.20E-08 5.20E-08 ", "style": "{font-size: 10px; color: #778877}" }, "y_axis":{ "min": 3, "max": 12.28, "steps": 2 }, "y_axis_right": { "stroke": 0, "colour": "#D7E4A3", "tick-length": 30, "steps": 1, "labels": [ "Indicator","Threshold","A","Be ","Will","This" ] } }
;
var horizontal_bar_chart_2=
{

  "title_":{
    "text":"Tooltip Hover",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "hbar",
      "tip":       "#val#<br>L:#left#, R:#right#",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [{"right":10},{"right":15},{"left":5,"right":15}]
    }
  ],
  "x_axis":{
    "min":    0,
    "max":    20,
    "offset": false,
    "labels": {
      "labels": ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"]
    }
  },
  "y_axis":{
    "offset":      true,
    "labels": ["slashdot.org","digg.com","reddit.com"]
    
  },

  "tooltip":{
    "mouse": 1
  }
}
;
var horizontal_bar_chart_3=
{

  "title_":{
    "text":"Tooltip Hover",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "hbar",
      "tip":       "#val#<br>L:#left#, R:#right#",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [{"right":10},{"right":15},{"left":5,"right":15}]
    }
  ],
  "x_axis":{
    "min":    0,
    "max":    20,
    "offset": false,
    "labels": {
      "labels": ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"]
    }
  },
  "y_axis":{
    "offset":      true,
    "labels": ["slashdot.org","digg.com","reddit.com"]
    
  },

  "tooltip":{
    "mouse": 1
  }
}
;
var horizontal_bar_chart=
{

  "title_":{
    "text":"Horizontal Bar Chart",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "hbar",
      "tip":       "#val#<br>L:#left#, R:#right#",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [{"right":10},{"right":15},{"left":5,"right":15}]
    }
  ],
  "x_axis_":{
    "min":    0,
    "max":    20,
    "offset": false,
    "labels": {
      "labels": ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v"]
    }
  },
  "y_axis":{
    "offset":      true,
    "labels": ["slashdot.org","digg.com","reddit.com"]
  },

  "tooltip_":{
    "mouse": 0
  }
}
;
var keys_1=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#ff00ff", "text": "Key 2", "font-size": 16},
        {"colour":"#FFB9F0", "text": "Key 3"},
        {"colour":"#FFB9F0", "font-size": 16},
        {"text": "Key 5", "font-size": 16}
      ],

      "values" :   [
                    [2.5,{"val":5}],
                    [{"val":2.5},{"val":5},{"val":2.5}],
                    null,
                    [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff"},{"val":2},{"val":2}]
                   ]
    }
  ],

  "x_axis":{
    "max":4,
    "steps": 1,
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  }
}
;
var languages_chinese=
{

  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 4,

    "labels":{
      "visible": true,
      "ro--tate": "vertical",
      "steps":  2,
      "labels": ["08\u5e7408\u670801\u65e5","08\u5e7408\u670802\u65e5"]
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var line_2=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "values" :   [
        6,6,
        {"value":7, "colour":"#FF0000", "tip":"LINE<br>#val#", "dot-size":12, "halo-size": 3 },
        8,8]
    },
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 2,
      "values" :   [
        4,4,
        {"value":5, "colour":"#FF0000", "tip":"HOLLOW<br>#val#", "dot-size":12, "halo-size": 3 },
        6,6]
    },
    {
      "type":      "line_dot",
      "colour":    "#736AFF",
      "text":      "Line Dot Key",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
      "tip":       "global dot<br>#val#",
      "values" :  [
        2,2,
        {"value":3, "colour":"#FF0000", "tip":"DOT<br>#val#<br>Key: #key#<br>#x_label#, #x_legend#", "dot-size":12, "halo-size": 3 },
        4,4] 
    }
  ],


  "y_axis":{
    "max":   10
  }

}
;
var line_anchor=
﻿{
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     1,
	  "dot-style": {
		"type":"anchor", "sides":4,
		"alpha":1, "hollow":true,
		"background-colour":"#a44a80", "background-alpha": 0.4,
		"width":1, "tip":"type = anchor<br>sides = 4<br>hollow" },
    
      "values" :   [3,0,-3]
    }
  ],

  "y_axis":{
	  "min": -5,
    "max":   5
  }

}
;
var line_bow=
﻿{
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     1,
	  "dot-style": {
				"type":"bow", "dot-size": 6, "tip":"#val#<br>#x_label#" },
    
      "values" :   [3,0,-3]
    }
  ],

  "y_axis":{
	  "min": -5,
    "max":   5
  }

}
;
var line_bug_report=
{
	"elements":[
		{
			"type":"line",
			"values":[1,0,0,0,0,0,0,0,1,0,0,0,6,2,0,0,0,0,0,6,0,0,0,0],
			"colour":"#ffae00",
			"text":"Returning Visits",
			"font-size":12,
			"tip":"Returning: #val#"
		},
		{
			"type":"line",
			"values":[7,5,5,8,6,6,7,11,4,7,5,3,3,11,8,9,12,10,11,11,8,4,10,2],
			"colour":"#52aa4b",
			"text":"Unique Visits",
			"font-size":12,
			"tip":"Unique: #val#"
		},
		{
			"type":"line",
			"values":[14,26,12,20,18,20,12,68,8,8,5,3,10,32,31,16,22,33,32,36,49,8,31,5],
			"colour":"#335ac9",
			"text":"Total Visits",
			"font-size":12,
			"tip":"Total: #val#"
		}
	],
	"title":{
		"text":"Visits data for Alan Edwardes from the 4th of June to the 5th of June",
		"style":"{font-size:12px;padding-bottom:10px;text-align:left;color:#999999;}"
	},
	"y_axis":{
		"stroke":1,
		"colour":"#c6d9fd",
		"grid-colour":"#dddddd",
		"min":0,
		"max":73,
		"steps":5
	},
	"x_axis":{
		"offset":false,
		"stroke":1,
		"colour":"#c6d9fd",
		"grid-colour":"#dddddd",
		"labels":{
			"labels":["09pm","10pm","11pm","12am","01am","02am","03am","04am","05am","06am","07am","08am","09am","10am","11am","12pm","01pm","02pm","03pm","04pm","05pm","06pm","07pm","08pm"]
			}
		},
	"bg_colour":"#ffffff"
}
;
var line_dash=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     2,
			"dot-style":    {
				"type":"anchor",
				"sides":3,
				"width":1,
				"tip":"type = anchor\nsides = 3\nhollow" },

			"line-style": {"style":"dash","on":10,"off":5},
			"values" : [
				6,6,
				{"value":7, "colour":"#FF0000", "tip":"LINE<br>#val#", "dot-size":12, "halo-size": 3 },
				8,8]
		},
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Line Dot Key",
			"font-size": 10,
			"width":     2,
			"dot-style":    {
				"type":"anchor",
				"sides":3,
				"width":1,
				"tip":"type = anchor\nsides = 3\nhollow" },
			"tip":       "global dot<br>#val#",
			"values" :  [
				2,2,
				{"value":3, "colour":"#FF0000", "tip":"DOT<br>#val#<br>Key: #key#<br>#x_label#, #x_legend#", "dot-size":12, "halo-size": 3 },
				4,4] 
		}
	],


  "y_axis":{
    "max":   10
  }

}
;
var line_dot=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     2,
			"dot-style": {
				"type":"solid-dot", "colour":"#a44a80", "dot-size": 6,
				"tip":"#val#<br>#x_label#" },
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,
				2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,
				0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,
				{"value":1.22, "colour":"#FF0000"},
				1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,
				2.48,2.44,2.35,2.23,2.08]
		}
	],

  "x_axis":{
    "labe--ls": {
      "rotate": "vertical",
      "labels":["2:00am % �","2:10","2:20","2:30","2:40","2:50",
                "3:00am","3:10","3:20","3:30","3:40","3:50",
                "4:00am","4:10","4:20","4:30","4:40","4:50",
                "5:00am","5:10","5:20","5:30","5:40","5:50",
                "6:00am","6:10","6:20","6:30","6:40","6:50",
                "7:00am","7:10","7:20","7:30","7:40","7:50",
                "8:00am","8:10","8:20","8:30","8:40","8:50",
                "9:00am","9:10","9:20"]
    }
  },

  "y_axis":{
    "max":   3
  }

}
;
var line_hollow=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
	  "dot-style":    { "ty--pe":"anchor", "sides":3, "alpha":1, "hollow":true, "background-colour":"#a44a80", 
						"background-alpha": 0.4, "width":1, "tip":"type = anchor\nsides = 3\nhollow" },
      "values" :   [
			1.5,1.69,1.88,2.06,2.21,2.34,2.43,
			2.48,2.49,2.47,2.40,2.30,2.17,2.01,
			1.83,1.64,1.44,1.24,1.05,
			{"value" :0.88, "type":"anchor"},
			{"value" :0.74, "type":"anchor", "colour":"#00FF00", "sides":4, "rotation":45},
			0.62,0.54,0.50,0.50,0.54,0.61,0.72,
			0.86,1.03,1.22,1.41,1.61,1.81,1.99,
			2.15,2.29,2.39,2.46,2.49,
			{"value" :2.48, "type":"star", "colour":"#FF0000", "hollow":true},
			{"value" :2.44, "type":"star", "colour":"#FF0000", "dot-size":10},
			{"value" :2.35, "type":"dot", "colour":"#FF0000"},
			{"value" :2.23, "type":"solid-dot", "colour":"#00FF00"},
			{"value" :2.08, "type":"hollow-dot", "colour":"#FF00FF"}]
    }
  ],

  "x_axis":{
    "labels--":["2:00am","2:10","2:20","2:30","2:40","2:50",
              "3:00am","3:10","3:20","3:30","3:40","3:50",
              "4:00am","4:10","4:20","4:30","4:40","4:50",
              "5:00am","5:10","5:20","5:30","5:40","5:50",
              "6:00am","6:10","6:20","6:30","6:40","6:50",
              "7:00am","7:10","7:20","7:30","7:40","7:50",
              "8:00am","8:10","8:20","8:30","8:40","8:50",
              "9:00am","9:10","9:20"]
  },

  "y_axis":{
    "max":   3
  }

}
;
var line_null_bug=
    {
      "elements": [
        {
          "type": "line",
          "values": [
            {         
              "value": 3         
            },
            {         
              "value": null         
            },
            {         
              "value": 3         
            }
          ],
          "dot-style": {
            "type": "hollow-dot",
            "colour": "#ff0000",
            "dot-size": 4,
            "halo-size": 1
          }
        },
		
		{
          "type": "line",
          "values": [2,null,2],
          "dot-style": {
            "type": "hollow-dot",
            "colour": "#ff0000",
            "dot-size": 4,
            "halo-size": 1
          }
        },
		
		{
          "type": "line",
          "values": [
			{"value": 4},null,4],
          "dot-style": {
            "type": "hollow-dot",
            "colour": "#ff0000",
            "dot-size": 4,
            "halo-size": 1
          }
        }
      ]
    }
;
var line_on_click=
{
	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     2,
			"dot-style": {
				"on-click":  "trace:http://eden"},
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,
				{"value":2.44,"colour":"#FF0000","tip":"monkies","on-click":"trace:anchor_test"},
				2.35,2.23,2.08]
		}
	]
}
;
var line_on_show=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     1,
			"dot-style": {
				"type":"solid-dot", "colour":"#a44a80", "dot-size": 3,
				"tip":"#val#<br>#x_label#" },
			"on-show":	{"type": "shrink-in", "cascade":1, "delay":0.5},
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,2.43,
				2.48,2.49,2.47,2.40,2.30,2.17,2.01,
				1.83,1.64,1.44,1.24,1.05,0.88,0.74,
				0.62,0.54,0.50,0.50,0.54,0.61,0.72,
				0.86,1.03,1.22,1.41,1.61,1.81,1.99,
				2.15,2.29,2.39,2.46,2.49,2.48,
				{"value":2.44,"colour":"#FF0000","tip":"monkies"},
				2.35,2.23,2.08]
		}
	],

  "x_axis":{
    "labels": {
      "rotate": "vertical",
      "labels":["2:00am % �","2:10","2:20","2:30","2:40","2:50",
                "3:00am","3:10","3:20","3:30","3:40","3:50",
                "4:00am","4:10","4:20","4:30","4:40","4:50",
                "5:00am","5:10","5:20","5:30","5:40","5:50",
                "6:00am","6:10","6:20","6:30","6:40","6:50",
                "7:00am","7:10","7:20","7:30","7:40","7:50",
                "8:00am","8:10","8:20","8:30","8:40","8:50",
                "9:00am","9:10","9:20"]
    }
  },

  "y_axis":{
    "max":   3
  }

}
;
var line_star=
{
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     1,
	  "dot-style": {
				"type":"star", "dot-size": 6, "tip":"#val#<br>#x_label#" },
    
      "values" :   [3,0,-3]
    }
  ],

  "y_axis":{
	  "min": -5,
    "max":   5
  }

}
;
var line=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     2,
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,2.43,
				2.48,2.49,2.47,2.40,2.30,2.17,2.01,
				1.83,1.64,1.44,1.24,1.05,0.88,0.74,
				0.62,0.54,0.50,0.50,0.54,0.61,0.72,
				0.86,1.03,1.22,1.41,1.61,1.81,1.99,
				2.15,2.29,2.39,2.46,2.49,2.48,
				{"value":2.44,"colour":"#FF0000","tip":"monkies"},
				2.35,2.23,2.08]
		}
	],

  "x_axis":{
    "labels": {
      "rotate": "vertical",
      "labels":["2:00am % �","2:10","2:20","2:30","2:40","2:50",
                "3:00am","3:10","3:20","3:30","3:40","3:50",
                "4:00am","4:10","4:20","4:30","4:40","4:50",
                "5:00am","5:10","5:20","5:30","5:40","5:50",
                "6:00am","6:10","6:20","6:30","6:40","6:50",
                "7:00am","7:10","7:20","7:30","7:40","7:50",
                "8:00am","8:10","8:20","8:30","8:40","8:50",
                "9:00am","9:10","9:20"]
    }
  },

  "y_axis__":{
    "max":   3
  }

}
;
var menu=
﻿{
	"y_legend":{
		"text":   "Time of day",
		"style": "{color: #736AFF;}"
	},
	
	"menu":{
		"colour":			"#E0E0ff",
		"outline-colour":	"#707070",
		"values" : [
				{
					"type":		"camera-icon",
					"text":		"Save as image"
				},
				{
					"type":		"text",
					"text":		"Save as image 2"
				},
				{
					"type":		"camera-icon",
					"text":		"3!!",
					"javascript-function":	"my_function"
				}
			]
	},

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     2,
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,2.43,
				2.48,2.49,2.47,2.40,2.30,2.17,2.01,
				1.83,1.64,1.44,1.24,1.05,0.88,0.74,
				0.62,0.54,0.50,0.50,0.54,0.61,0.72,
				0.86,1.03,1.22,1.41,1.61,1.81,1.99,
				2.15,2.29,2.39,2.46,2.49,2.48,
				{"value":2.44,"colour":"#FF0000","tip":"monkies"},
				2.35,2.23,2.08]
		}
	],

  "y_axis":{
    "max":   3
  }

}
;
var on_show_area_drop=
﻿{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "drop", "cascade":0.6, "delay":0.5}
		}
	]
}
;
var on_show_area_explode=
﻿{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "explode", "cascade":0.6, "delay":0.5}
		}
	]
}
;
var on_show_area_fade_in=
﻿{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "fade-in", "cascade":0.6, "delay":0.5}
		}
	]
}
;
var on_show_area_mid_slide=
﻿{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "dot-size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "mid-slide", "cascade":0.6, "delay":0.5}
		}
	]
}
;
var on_show_area_pop_up=
{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "pop-up", "cascade":0.6, "delay":0.5}
		}
	]
}
;
var on_show_area_shrink_in=
﻿{
	"title":{
		"text":"Volume Consumed",
		"style":"font-size: 14px; font-family: Verdana; text-align: center;"},
	"x_axis":{
		"offset": false,
		"labels":{
			"steps":3,
			"labels":[
				"0","1","2","3","4","5",
				"6","7","8","9","10","11",
				"12","13","14","15","16",
				"17","18","19","20","21",
				"22","23","24","25","26",
				"27","28","29","30","31"]
				}
		},
	"bg_colour":"#ffffff",
	"elements":[
		{
			"type":			"area",
			"colour":		"#CC3399",
			"line-style":	{"style":"dash","on":4,"off":4},
			"dot-style":	{"type":"hollow-dot", "width":1, "size":2},
			"values":[
				4,4.37,4.73,5.07,5.36,5.59,5.77,5.87,5.89,5.85,5.72,5.53,5.28,4.97,4.63,4.26,
				3.88,3.51,3.15,2.83,2.56,2.34,2.19,2.11,2.10,2.17,2.32,2.53,2.80,3.11,3.46,3.84],
			"fill-alpha":0.5,
			"width":     1,
			"on-show":	{"type": "shrink-in", "cascade":1.6, "delay":0.2}
		}
	]
}
;
var on_show_line=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"text":      "Avg. wave height (cm)",
			"font-size": 10,
			"width":     1,
			"dot-style": {
				"type":"solid-dot", "colour":"#a44a80", "dot-size": 3,
				"tip":"#val#<br>#x_label#" },
			"on-show":	{"type": "pop-up", "cascade":1, "delay":0.5},
			"values" :   [
				1.5,1.69,1.88,2.06,2.21,2.34,2.43,
				2.48,2.49,2.47,2.40,2.30,2.17,2.01,
				1.83,1.64,1.44,1.24,1.05,0.88,0.74,
				0.62,0.54,0.50,0.50,0.54,0.61,0.72,
				0.86,1.03,1.22,1.41,1.61,1.81,1.99,
				2.15,2.29,2.39,2.46,2.49,2.48,
				{"value":2.44,"colour":"#FF0000","tip":"monkies"},
				2.35,2.23,2.08]
		}
	],

  "x_axis":{
    "labels": {
      "rotate": "vertical",
      "labels":["2:00am % �","2:10","2:20","2:30","2:40","2:50",
                "3:00am","3:10","3:20","3:30","3:40","3:50",
                "4:00am","4:10","4:20","4:30","4:40","4:50",
                "5:00am","5:10","5:20","5:30","5:40","5:50",
                "6:00am","6:10","6:20","6:30","6:40","6:50",
                "7:00am","7:10","7:20","7:30","7:40","7:50",
                "8:00am","8:10","8:20","8:30","8:40","8:50",
                "9:00am","9:10","9:20"]
    }
  },

  "y_axis":{
    "max":   3
  }

}
;
var on_show_scatter_explode=
{

  "elements":[
    {
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"solid-dot"},
	  "on-show":	{"type": "explode", "cascade":0.6, "delay":1},
      "values" :   [
                     {"x":-5,  "y":-5 },
                     {"x":0,   "y":0  },
                     {"x":5,   "y":5,  "dot-size":20},
                     {"x":5,   "y":-5, "dot-size":5},
                     {"x":-5,  "y":5,  "dot-size":5},
                     {"x":0.5, "y":1,  "dot-size":15, "tip": "moooo"}
                   ]
    },
    {
      "type":      "scatter",
      "colour":    "#B900FF",
      "text":      "No 2",
      "font-size": 10,
	  "dot-style":	{"type":"hollow-dot", "width":1, "size":2},
	  "on-show":	{"type": "explode", "cascade":0.6, "delay":0.5},
      "values" :   [
                     {"x":-5,  "y":-3},
                     {"x":0,   "y":0.5}
                   ]
    },
    {
      "type":      "line",
      "colour":    "#B9FF00",
      "text":      "Line",
      "font-size": 10,
      "values" :   [3,3,3,3,3]
    }

  ],

  "x_axis":{
    "min": -5,
    "max": 5,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}


/*
&bg_colour=#DFFFDF&
&x_label_style=12,#9933CC&
&y_label_style=12,#9933CC&
&tool_tip=x:#x_label#<br>y:#val#&
*/

;
var pie_1=
{

  "title":{
    "text":"Pie for you sir?",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":      "pie",
      "colours":   ["#d01f3c","#356aa0","#C79810"],
      "alpha":     0.6,
      "border":    2,
      "start-angle": 35,
      "values" :   [
        2,
        3,
        {"value":6.5,"label":"hello (#val#)", "tip":"99 bottles of beer","on-click":"http://eden"},
        {"value":6.5,"on-click":"my_function"}
      ]
    }
  ]
}
;
var pie_2=
{

  "elements":[
    {
      "type":      "pie",
      "colours":   ["#d01f3c","#356aa0","#C79810"],
      "alpha":     0.2,
      "border":    2,
      "animate":		[ { "type": "fade" }],
      "start-angle": 45,
      "tip":         "#val#<br>#total#<br>#percent#<br>#label#",
      "gradient-fill" :  true,
      "label-colour":    "#0000d0",
      "values" :
        [10,10,{"value":100,"label":"hello (#val#)","font-size":20,"colour":"#00FF00","label-colour":"#00FFFF"},10]
    }
  ]
}
;
var pie_3=
{
  "bg_colour": 	"#ffffff",
  "elements":[
    {
      "type":          "pie",
      "tip":           "#label#<br>$#val# (#percent#)",
      "colours":       ["#00ff00","#ff0000","#0000ff"],
      "alpha":         0.3,
      "animate":		[ { "type": "fade" }],
      "start-angle":   90,      
      "gradient-fill": true,
      "no-labe-ls":     true,
      "values": [
        {"value":13400,"label":"Income"},{"value":9344,"label":"Expense"},{"value":4066,"label":"Profit"}
      ]
    }
  ]
}
;
var pie_4=
{
  "elements" : [
    {
      "tip" : "#val# of #total# messages<br>#percent#",
      "colours" : [
        "#000000",
        "#4693B8"
      ],
      "alpha" : "0.8",
      "start_angle" : 135,
      "animate" : false,
      "values" : [
        {
          "value" : 135,
          "label" : "spam deliveries"
        },
        {
          "value" : 103,
          "label" : "normal deliveries"
        }
      ],
      "type" : "pie",
      "border" : "2"
    }
  ],
  "bg_colour" : "#FAFAFA",
  "title" : {
    "text" : "mail distribution for b@b.com",
    "style" : "{font-size: 14px; color:#0000ff; font-family: Verdana; text-align: center;}"
  }
}
;
var pie_bug_green=
{
    "bg_colour": "#ffffff", 
    "elements": [
        {
            "alpha": 0.5,
			"animate":[{"type":"bounce","distance":5},{"type":"fade"}],
            "border": 2, 
            "colours": [
                "#0247fe", 
                "#3d01a4", 
                "#8601af", 
                "#a7194b", 
                "#fe2712", 
                "#fd5308", 
                "#fb9902", 
                "#fabc02", 
                "#fefe33", 
                "#d0ea2b", 
                "#66b032", 
                "#0392ce"
            ], 
            "label-colour": "#432baf", 
            "start-angle": 0, 
            "tip": "#val# of #total#<br>#percent# of 100%", 
            "type": "pie", 
            "values": [
                {
                    "label": "New Zealand", 
                    "value": 52236
                }, 
                {
                    "label": "Vodafone Mobile", 
                    "value": 9560
                }, 
                {
                    "label": "Airedale Street", 
                    "value": 6367
                }, 
                {
                    "label": "Ellerslie", 
                    "value": 5870
                }, 
                {
                    "label": "Auckland LICA", 
                    "value": 2627
                }, 
                {
                    "label": "Manukau City", 
                    "value": 2360
                }, 
                {
                    "label": "Telecom Mobile", 
                    "value": 2068
                }, 
                {
                    "label": "Remuera", 
                    "value": 1747
                }, 
                {
                    "label": "Henderson", 
                    "value": 1231
                }, 
                {
                    "label": "East Tamaki / Otara", 
                    "value": 1187
                }
            ]
        }
    ], 
    "title": {
        "style": "{color: #888888; font-size: 16; text-align: center}", 
        "text": "Top 10 Caller Locations by OGA"
    }
}
;
var pie_colours=
{

	"title":{
		"text":"Pie for you sir?",
		"style":"{font-size: 30px;}"
	},
	"bg_colour": "#000000",

	"elements":[
		{
			"type":      "pie",
			"colours":   ["#d01f3c","#356aa0","#C79810"],
			"alpha":     0.6,
			"border":    2,
			"ani-mate":   0,
			"start-angle": 35,
			"values" :   [
				2,
				3,
				{"value":65,"label":"hello (#val#)", "tip":"99 bottles of beer","on-click":"http://eden"},
				{"value":65,"on-click":"my_function"}
			]
		}
	]
}
;
var pie_fixed_radius=
﻿{

	"title":{
		"text":"Pie for you sir?",
		"style":"{font-size: 30px;}"
	},
	"bg_colour": "#000000",

	"elements":[
		{
			"type":      "pie",
			"colours":   ["#d01f3c","#356aa0","#C79810"],
			"alpha":     0.6,
			"start-angle": 35,
			"radius":	55,
			"values" :   [
				2,
				3,
				{"value":65,"label":"hello (#val#)", "tip":"99 bottles of beer","on-click":"http://eden"},
				{"value":65,"on-click":"my_function"}
			]
		}
	]
}
;
var pie_label_colours=
﻿{
  "elements" : [
    {
      "tip" : "#val# of #total#<br>#percent#\npie radius = #radius#",
	  
      "colours" : [
		"0x336699", "0x88AACC", "0x999933", "0x666699",
		"0xCC9933", "0x006666", "0x3399FF", "0x993300",
		"0xAAAA77", "0x666666", "0xFFCC66", "0x6699CC",
		"0x663366", "0x9999CC", "0xAAAAAA", "0x669999",
		"0xBBBB55", "0xCC6600", "0x9999FF", "0x0066CC",
		"0x99CCCC", "0x999999", "0xFFCC00", "0x009999",
		"0x99CC33", "0xFF9900", "0x999966", "0x66CCCC",
		"0x339966", "0xCCCC33"      ],
		
      "alpha" : 0.2,
      "start_angle" : 135,
	  "radius":200,
	  "no-labels":false,
      "ani--mate" : true,
	  //"label-colour":0,  // leave out or set to null for auto-colour labels
      "values" : [
        {
          "value" : 135,
          "label" : "Label Num 1 - click to google",
		  "label-colour":"0xFF0000",         // Override the label colour
		  "on-click":"http://www.google.com",
		  "animate":[{"type":"bounce","distance":5}]
        },
        {
          "value" : 135,
          "label" : "Label Num 2",
		  "animate":[{"type":"bounce","distance":5}]
        },
        {
          "value" : 135,
          "label" : "Label Num 3",
		  "animate":[{"type":"bounce","distance":5},{"type":"fade"}]
        },
        {
          "value" : 135,
          "label" : ""      // Do not display a label for this slice
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 6"
        },
        {
          "value" : 135,
          "label" : "Label Num 7"
        },
        {
          "value" : 4,
          "label" : "small slice 8"
        },
        {
          "value" : 4,
          "label" : "small slice 9"
        },
        {
          "value" : 4,
          "label" : "small slice 10"
        },
        {
          "value" : 4,
          "label" : "small slice 11"
        },
        {
          "value" : 4,
          "label" : "small slice 12"
        },
        {
          "value" : 135,
          "label" : "Label Num 13"
        },
        {
          "value" : 135,
          "label" : "Label Num 14"
        },
        {
          "value" : 135,
          "label" : "Label Num 15"
        },
        {
          "value" : 135,
          "label" : "Label Num 16"
        },
        {
          "value" : 135,
          "label" : "Label Num 17"
        },
        {
          "value" : 135,
          "label" : "Label Num 18"
        },
        {
          "value" : 135,
          "label" : "Label Num 19"
        },
        {
          "value" : 135,
          "label" : "Label Num 20"
        },
        {
          "value" : 135,
          "label" : "Label Num 21"
        },
        {
          "value" : 135,
          "label" : "Label Num 22"
        },
        {
          "value" : 135,
          "label" : "Label Num 23"
        },
        {
          "value" : 135,
          "label" : "Label Num 24"
        },
        {
          "value" : 135,
          "label" : "Label Num 25"
        },
        {
          "value" : 135,
          "label" : "Label Num 26"
        },
        {
          "value" : 135,
          "label" : "Label Num 27"
        },
        {
          "value" : 135,
          "label" : "Label Num 28"
        },
        {
          "value" : 135,
          "label" : "Label Num 29"
        },
        {
          "value" : 135,
          "label" : "Label Num 30"
        },
        {
          "value" : 135,
          "label" : "Label Num 31"
        },
        {
          "value" : 0,
          "label" : "zero slice 32"
        },
        {
          "value" : 0,
          "label" : "zero slice 33"
        },
        {
          "value" : 0,
          "label" : "zero slice 34"
        },
        {
          "value" : 135,
          "label" : "Label Num 35"
        },
        {
          "value" : 135,
          "label" : "Label Num 36"
        },
        {
          "value" : 135,
          "label" : "Label Num 37"
        },
        {
          "value" : 135,
          "label" : "Label Num 38"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 40"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 42"
        },
        {
          "value" : 135,
          "label" : "Label Num 43"
        },
        {
          "value" : 103,
          "label" : "Label Num 44"
        }
      ],
      "type" : "pie",
      "border" : "2"
    }
  ],
  "bg_colour" : "#FAFAFA",
  "title" : {
    "text" : "Auto-size Pie and Label Adjustment",
    "style" : "{font-size: 14px; color:#0000ff; font-family: Verdana; text-align: center;}"
  }
}
;
var pie_many_slices_fixed=
﻿{
  "elements" : [
    {
      "tip" : "#val# of #total# messages<br>#percent#\npie radius = #radius#",
      "colours" : [
        "#000000",
        "#4693B8"
      ],
      "alpha" : "0.8",
      "start_angle" : 135,
	  "radius":200,
	  "no-labels":false,
      "animate" : false,
      "values" : [
        {
          "value" : 135,
          "label" : "Label Num 1"
        },
        {
          "value" : 135,
          "label" : "Label Num 2"
        },
        {
          "value" : 135,
          "label" : "Label Num 3"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 6"
        },
        {
          "value" : 135,
          "label" : "Label Num 7"
        },
        {
          "value" : 4,
          "label" : "small slice 1"
        },
        {
          "value" : 4,
          "label" : "small slice 2"
        },
        {
          "value" : 4,
          "label" : "small slice 3"
        },
        {
          "value" : 4,
          "label" : "small slice4 "
        },
        {
          "value" : 4,
          "label" : "small slice 5"
        },
        {
          "value" : 135,
          "label" : "Label Num 8"
        },
        {
          "value" : 135,
          "label" : "Label Num 9"
        },
        {
          "value" : 135,
          "label" : "Label Num 10"
        },
        {
          "value" : 135,
          "label" : "Label Num 11"
        },
        {
          "value" : 135,
          "label" : "Label Num 12"
        },
        {
          "value" : 135,
          "label" : "Label Num 13"
        },
        {
          "value" : 135,
          "label" : "Label Num 14"
        },
        {
          "value" : 135,
          "label" : "Label Num 15"
        },
        {
          "value" : 135,
          "label" : "Label Num 16"
        },
        {
          "value" : 135,
          "label" : "Label Num 17"
        },
        {
          "value" : 135,
          "label" : "Label Num 18"
        },
        {
          "value" : 135,
          "label" : "Label Num 19"
        },
        {
          "value" : 135,
          "label" : "Label Num 20"
        },
        {
          "value" : 135,
          "label" : "Label Num 21"
        },
        {
          "value" : 135,
          "label" : "Label Num 22"
        },
        {
          "value" : 135,
          "label" : "Label Num 23"
        },
        {
          "value" : 135,
          "label" : "Label Num 24"
        },
        {
          "value" : 135,
          "label" : "Label Num 25"
        },
        {
          "value" : 135,
          "label" : "Label Num 26"
        },
        {
          "value" : 135,
          "label" : "Label Num 27"
        },
        {
          "value" : 135,
          "label" : "Label Num 28"
        },
        {
          "value" : 135,
          "label" : "Label Num 29"
        },
        {
          "value" : 135,
          "label" : "Label Num 30"
        },
        {
          "value" : 135,
          "label" : "Label Num 31"
        },
        {
          "value" : 135,
          "label" : "Label Num 32"
        },
        {
          "value" : 135,
          "label" : "Label Num 33"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 35"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 36"
        },
        {
          "value" : 135,
          "label" : "Label Num 37"
        },
        {
          "value" : 103,
          "label" : "Label Num 38"
        }
      ],
      "type" : "pie",
      "border" : "2"
    }
  ],
  "bg_colour" : "#FAFAFA",
  "title" : {
    "text" : "Fixed Radius Pie and Auto Label Adjustment",
    "style" : "{font-size: 14px; color:#0000ff; font-family: Verdana; text-align: center;}"
  }
}
;
var pie_many_slices=
﻿{
  "elements" : [
    {
      "tip" : "#val# of #total# messages<br>#percent#\npie radius = #radius#",
      "colours" : [
        "#000000",
        "#4693B8"
      ],
      "alpha" : "0.8",
      "start_angle" : 135,
//	  "radius":200,
	  "no-labels":false,
      "animate" : false,
      "values" : [
        {
          "value" : 135,
          "label" : "Label Num 1"
        },
        {
          "value" : 135,
          "label" : "Label Num 2"
        },
        {
          "value" : 135,
          "label" : "Label Num 3"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 6"
        },
        {
          "value" : 135,
          "label" : "Label Num 7"
        },
        {
          "value" : 4,
          "label" : "small slice 1"
        },
        {
          "value" : 4,
          "label" : "small slice 2"
        },
        {
          "value" : 4,
          "label" : "small slice 3"
        },
        {
          "value" : 4,
          "label" : "small slice4 "
        },
        {
          "value" : 4,
          "label" : "small slice 5"
        },
        {
          "value" : 135,
          "label" : "Label Num 8"
        },
        {
          "value" : 135,
          "label" : "Label Num 9"
        },
        {
          "value" : 135,
          "label" : "Label Num 10"
        },
        {
          "value" : 135,
          "label" : "Label Num 11"
        },
        {
          "value" : 135,
          "label" : "Label Num 12"
        },
        {
          "value" : 135,
          "label" : "Label Num 13"
        },
        {
          "value" : 135,
          "label" : "Label Num 14"
        },
        {
          "value" : 135,
          "label" : "Label Num 15"
        },
        {
          "value" : 135,
          "label" : "Label Num 16"
        },
        {
          "value" : 135,
          "label" : "Label Num 17"
        },
        {
          "value" : 135,
          "label" : "Label Num 18"
        },
        {
          "value" : 135,
          "label" : "Label Num 19"
        },
        {
          "value" : 135,
          "label" : "Label Num 20"
        },
        {
          "value" : 135,
          "label" : "Label Num 21"
        },
        {
          "value" : 135,
          "label" : "Label Num 22"
        },
        {
          "value" : 135,
          "label" : "Label Num 23"
        },
        {
          "value" : 135,
          "label" : "Label Num 24"
        },
        {
          "value" : 135,
          "label" : "Label Num 25"
        },
        {
          "value" : 135,
          "label" : "Label Num 26"
        },
        {
          "value" : 135,
          "label" : "Label Num 27"
        },
        {
          "value" : 135,
          "label" : "Label Num 28"
        },
        {
          "value" : 135,
          "label" : "Label Num 29"
        },
        {
          "value" : 135,
          "label" : "Label Num 30"
        },
        {
          "value" : 135,
          "label" : "Label Num 31"
        },
        {
          "value" : 135,
          "label" : "Label Num 32"
        },
        {
          "value" : 135,
          "label" : "Label Num 33"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 35"
        },
        {
          "value" : 135,
          "label" : ""
        },
        {
          "value" : 135,
          "label" : "Label Num 36"
        },
        {
          "value" : 135,
          "label" : "Label Num 37"
        },
        {
          "value" : 103,
          "label" : "Label Num 38"
        }
      ],
      "type" : "pie",
      "border" : "2"
    }
  ],
  "bg_colour" : "#FAFAFA",
  "title" : {
    "text" : "Auto-size Pie and Label Adjustment",
    "style" : "{font-size: 14px; color:#0000ff; font-family: Verdana; text-align: center;}"
  }
}
;
var radar_2=
{
  "title":{
    "text":"Pie for you sir?",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "loop":      true,
      "values" :   [
 
        4, 5, {"value":6,"colour":"#FF0000","tip":"monkies"}, 7, 8, 9
      ]
    },
    {
		"type":      "line",
		"colour":    "#6AFF73",
		"text":      "Avg. wave height (cm)",
		"font-size": 10,
		"width":     2,
		"dot-style":  {
			"type":"star", "hollow":true, "background-colour":"#a44a80", 
			"background-alpha": 0.4, "width":1, "dot-size":10 },

		"loop":      true,
		"values" :   [
			15, 14, {"value":13,"colour":"#FF0000","tip":"monkies", "background-alpha": 0.9}, 12, 11, 10
		]
    }
  ],

  "radar_axis": {
    "max":         20,
    "stroke":      5,
    "colour":      "#167840",
    "grid-colour": "#E1AAF5"
  }
}
;
var radar_area=
{
  "title":{
    "text":"Fruit distribution",
    "style":"{font-size: 12px;}"
  },

	"elements":[
	{
		"type":      "area",
		"colour":    "#FA3D37",
		"fill":      "#FA3D37",
		"fill-alpha": 0.2,
		"text":      "Oranges",
		"width":     3,
		"font-size": 10,
		"dot-style": {
			"type":			"dot",
			"tip":			"Orange<br>#val#",
			"dot-size":		5},
		
		"loop":      true,
		"values" :   [3,3,9,9,9,3,3]
	},

	{
		"type":      "area",
		"colour":    "#C9C738",
		"fill":      "#C9C738",
		"fill-alpha": 0.2,
		"text":      "Limes",
		"width":     3,
		"font-size": 10,
		"dot-style": {
			"type":		"hollow-dot",
			"tip":		"Lime<br>#val#",
			"dot-size":	5},
		
		"loop":      true,
		"values" :   [9,9,3,3,3,9,9]
	}
  ],
  "radar_axis": {
    "max":         11,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF"
  },

  "bg_colour": "#ffffff"
}
;
var radar_axis_and_grid_style=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#D41E47",
      "text":      "How I love thee",
      "font-size": 10,
      "width":     2,
      "dot-size":  6,
      "halo-size": 0,
      "loop":      true,
      "values" :   [3,5,6,7,8,9,10,11.5,13,11.5,10,9,8,7,6,5]
    }
  ],

  
  "radar_axis": {
    "max":         13,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF",

    "labels":{
      "colour"  :"#ff0000",
      "labels": [
        "0","1",
        "2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello",
        "6","7","8","9","10","11","12","13"
      ]
    }
  }
}
;
var radar_axis_labels_2=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "area_line",
      "colour":    "#FA3D37",
      "fill":      "#FA3D37",
      "fill-alpha": 0.3,
      "text":      "Orange",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Orange<br>#val#",
      "loop":      true,
      "values" :   [2,2,2,2,2,2,2]
    },
    {
      "type":      "area_line",
      "colour":    "#3D37FA",
      "fill":      "#3D37FA",
      "fill-alpha": 0.3,
      "text":      "Blue",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Blue<br>#val#",
      "loop":      true,
      "values" :   [{"value":3, "tip":"3 Accuratesse"},3,3,1.5,1,2,3]
    }
  ],

  
  "radar_axis": {
    "max":         4,
    "stroke":      1,
    "colour":      "#909090",
    "grid-colour": "#C0DEBF",
    "steps":       4,

    "labels":{
      "colour"  :"#000000",
      "labels": [
        "0","1","2","3","4"
      ]
    },

    "spoke-labels":{
      "colour":  "#000000",
      "labels":  ["Accuratesse","Analystich<br>vermogen","Creativiteit","Plannen en<br>organiseren","Probleemanalyse","Samenwerken in<br>teamverband","Zelfstandigheid"]
    }
  }
}
;
var radar_axis_labels=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#D41E47",
      "text":      "How I love thee",
      "font-size": 10,
      "width":     2,
      "dot-size":  6,
      "halo-size": 0,
      "loop":      true,
      "values" :   [4,4,4,4,4,3.5]
    }
  ],

  
  "radar_axis": {
    "max":         5,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF",

    "labels":{
      "colour"  :"#ff0000",
      "labels": [
        "0","1","2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello"
      ]
    },

    "spoke-labels":{
      "colour":  "#000000",
      "labels":  ["A","bbb","c","d","E","F"]
    }
  }
}
;
var radar_axis_tooltip_closest=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#D41E47",
      "text":      "How I love thee",
      "font-size": 10,
      "width":     2,
      "dot-size":  6,
      "halo-size": 0,
      "loop":      true,
      "values" :   [4,4,4,4,4,3.5]
    }
  ],

  
  "radar_axis": {
    "max":         5,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF",

    "labels":{
      "colour"  :"#ff0000",
      "labels": [
        "0","1","2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello"
      ]
    }
  },

  "tooltip":{
    "mouse": 1
  }

}
;
var radar_axis_tooltip_hover=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#D41E47",
      "text":      "How I love thee",
      "font-size": 10,
      "width":     2,
      "dot-size":  6,
      "halo-size": 0,
      "loop":      true,
      "values" :   [4,4,4,4,4,3.5]
    }
  ],

  
  "radar_axis": {
    "max":         5,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF",

    "labels":{
      "colour"  :"#ff0000",
      "labels": [
        "0","1","2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello"
      ]
    }
  },

  "tooltip":{
    "mouse": 2
  }

}
;
var radar_chart_minus_numbers=
{
	"elements": 
		[
			{
				"fill": "#988d5a",
				"width": 3,
				"dot-size": 0,
				"colour": "#988d5a",
				"values": 
					[
						{"value": 10.129090909090907, "tip": "mooo"},
						-32.405162496404941,
						"-100",
						0,
						-15.443510737628385
					],
				"font-size": 0,
				"fillalpha": 0.3,
				"type": "area",
				"dot-style": 
					{
						"tip": "#val#%",
						"dot-size": 0,
						"value": 0
					},
				"loop": true
			}
		],
	"bg_colour": "#ffffff",
	"radar_axis": 
		{
			"labels": 
				{
					"labels": 
						[]
				},
			"spoke-labels": 
				{
					"labels": 
						[
							{
								"text": "Football",
								"size": 10,
								"visible": true
							},
							{
								"text": "Tennis",
								"size": 10,
								"visible": true
							},
							{
								"text": "Rugby",
								"size": 10,
								"visible": true
							},
							{
								"text": "F1",
								"size": 10,
								"visible": true
							},
							{
								"text": "Basket\u003Cbr>Ball",
								"size": 10,
								"visible": true
							}
						],
					"colour": "#1a171b"
				},
			"colour": "#e5e5e5",
			"grid-colour": "#e5e5e5",
			"steps": 25,
			"min": -100,
			"max": 100,
			"3d": 0
		},
	"x_axis": null,
	"y_axis": null
}
;
var radar_line_loop=
{
  "title":{
    "text":"Pie for you sir?",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "loop":      true,
      "values" :   [
 
        5, 10, {"value":10,"colour":"#FF0000","tip":"monkies"}, 20, 18
      ]
    },
    {
      "type":      "line",
      "colour":    "#73FF6A",
      "width":     1,
      "dot-size":  3,
      "halo-size": 2,
      "loop":      false,
      "values" :   [20,20,20,20,20]
    }
  ],

  "radar_axis": {
    "max": 20
  }
}
;
var radar_steps=
{
  "title":{
    "text":"Fruit distribution",
    "style":"{font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "area_hollow",
      "colour":    "#FA3D37",
      "fill":      "#FA3D37",
      "fill-alpha": 0.2,
      "text":      "Oranges",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "tip":       "Orange<br>#val#",
      "loop":      true,
      "values" :   [35,35,35]
    }
  ],
  "radar_axis": {
    "max":         50,
    "steps":       10,
    "stroke":      2,
    "colour":      "#A1D4B5",
    "grid-colour": "#C0DEBF"
  },

  "bg_colour": "#ffffff"
}
;
var radar_test_keys=
{
  "title":{
    "text":"Radar: key 2 disabled",
    "style":"{font-size: 20px;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Key 1",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "loop":      true,
      "values" :   [4,4,4,4,4,4,4]
    },
    {
      "type":      "line_hollow",
      "colour":    "#0000FF",
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "loop":      true,
      "values" :   [8,8,8,8,8,8,8]
    },
    {
      "type":      "line_dot",
      "colour":    "#6AFF73",
      "text":      "Key 3",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "loop":      true,
      "values" :   [14,14,14,14,14,14,14]
    }
  ],

  "radar_axis": {
    "max": 20
  }
}
;
var scatter_2=
{

  "elements":[
    {
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"solid-dot"},
	  "on-show":	{"type": "explode", "cascade":0.6, "delay":1},
      "values" :   [
                     {"x":-5,  "y":-5 },
                     {"x":0,   "y":0  },
                     {"x":5,   "y":5,  "dot-size":20},
                     {"x":5,   "y":-5, "dot-size":5},
                     {"x":-5,  "y":5,  "dot-size":5},
                     {"x":0.5, "y":1,  "dot-size":15, "tip": "moooo"}
                   ]
    },
    {
      "type":      "scatter",
      "colour":    "#B900FF",
      "text":      "No 2",
      "font-size": 10,
	  "dot-style":	{"type":"hollow-dot", "width":1, "size":2},
	  "on-show":	{"type": "explode", "cascade":0.6, "delay":0.5},
      "values" :   [
                     {"x":-5,  "y":-3},
                     {"x":0,   "y":0.5}
                   ]
    },
    {
      "type":      "line",
      "colour":    "#B9FF00",
      "text":      "Line",
      "font-size": 10,
      "values" :   [3,3,3,3,3]
    }

  ],

  "x_axis":{
    "min": -5,
    "max": 5,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}


/*
&bg_colour=#DFFFDF&
&x_label_style=12,#9933CC&
&y_label_style=12,#9933CC&
&tool_tip=x:#x_label#<br>y:#val#&
*/

;
var scatter_anchors=
{

  "title":{
    "text":"Sample Scatter Anchors",
    "style":"{font-size: 24px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },
  "num_decimals":3,

  "elements":[
    {
      "type":      "scatter",
      "colour":	   "#30BfBc",
	  "dot-style":    { "type":"anchor", "sides":3, "alpha":1, "hollow":true, "background-colour":"#a44a80", 
						"background-alpha": 0.4, "width":1, "tip":"type = anchor\nsides = 3\nhollow" },
      "animate":   0,
	  "dot-size":  12,
	  "width":     3,
	  "halo-size": 2,
	  "text":      "Sample Scatter Anchors",
	  "tip":       "[#x#,#y#] #size#\nSample Anchors",
	  "values" :   [
					{"x": 1, "y": 8, "type":"point", "tip":"type = point" },
					{"x": 2, "y": 8, "type":"solid-dot", "tip":"type = dot" },
					{"x": 3, "y": 8, "type":"bow", "hollow":false, "rotation":-45, "tip":"type = bow" },
					{"x": 4, "y": 8, "type":"bow", "hollow":true, "background-colour":"#b0101c", 
											"rotation":45, "tip":"type = bow\nhollow" },
					{"x": 5, "y": 8, "type":"bow", "hollow":true, "background-colour":"#b0101c", 
											"rotation":90, "tip":"type = bow\nhollow" },
					{"x": 6, "y": 8, "type":"star", "hollow":true, "rotation":0, "tip":"type = star\nhollow" },
					{"x": 7, "y": 8, "type":"star", "hollow":true, "rotation":90, "tip":"type = star\nhollow", "dot-size":12 },
					{"x": 8, "y": 8, "type":"star", "hollow":false, "rotation":180, "tip":"type = star", "dot-size":12 },
					{"x": 9, "y": 8, "type":"dot", "tip":"type = solid dot", "dot-size":12 },
					{"x": 1, "y": 4 },      // triangle from dot-style definition above
					{"x": 2, "y": 4, "type":"anchor", "sides":4, "tip":"type = anchor<br>sides = 4\nhollow" },
					{"x": 3, "y": 4, "type":"anchor", "sides":5, "tip":"type = anchor\nsides = 5\nhollow" },
					{"x": 4, "y": 4, "type":"anchor", "sides":6, "tip":"type = anchor\nsides = 6\nhollow" },
					{"x": 5, "y": 4, "type":"anchor", "sides":7, "tip":"type = anchor\nsides = 7\nhollow" },
					{"x": 6, "y": 4, "type":"anchor", "sides":8, "tip":"type = anchor\nsides = 8\nhollow" },
					{"x": 7, "y": 4, "type":"anchor", "sides":9, "tip":"type = anchor\nsides = 9\nhollow", "hollow":true, "background-colour":"#ffffff" },
					{"x": 8, "y": 4, "type":"anchor", "sides":10, "tip":"type = anchor\nsides = 10\nhollow" }
					]
    }
  ],
  
  "x_axis": {
    "min":    0,
    "max":    10,
    "offset": 0,
	"steps" : 1,
	"3d" : 0,
	"labels": { "rotate" : 0, "size": 10 }
  },
  
  "y_axis": {
    "min":    0,
    "max":    10,
	"stroke": 2,
	"steps" : 1,
    "offset": 0
  }
}
;
var scatter_line_2=
{

  "title":{
    "text":"ScatterLine Test Chart",
    "style":"{font-size: 24px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; background-color: #356AA0; }"
  },

  "elements":[
    {
      "type":      "scatter_line",
      "colours":   ["#d01f3c","#356aa0","#C79810"],
      "alpha":     0.6,
      "border":    2,
      "animate":   0,
	  "dot-style": {"type":"solid-dot"},
	  "values" :   [
					// Draw a 60 sided object to approximate a circle
					{"x": 0, "y": -80 },
					{"x": 8.362277061412277, "y": -79.56175162946187 },
					{"x": 16.632935265420738, "y": -78.25180805870446 },
					{"x": 24.721359549995796, "y": -76.08452130361228 },
					{"x": 32.538931446064026, "y": -73.08363661140807 },
					{"x": 40.00000000000001, "y": -69.28203230275508 },
					{"x": 47.022820183397855, "y": -64.7213595499958 },
					{"x": 53.53044850870866, "y": -59.45158603819153 },
					{"x": 59.451586038191536, "y": -53.53044850870866 },
					{"x": 64.7213595499958, "y": -47.022820183397855 },
					{"x": 69.2820323027551, "y": -39.99999999999999 },
					{"x": 73.08363661140807, "y": -32.53893144606401 },
					{"x": 76.08452130361228, "y": -24.721359549995793 },
					{"x": 78.25180805870446, "y": -16.632935265420745 },
					{"x": 79.56175162946187, "y": -8.362277061412277 },
					{"x": 80, "y": 0 },
					{"x": 79.56175162946187, "y": 8.362277061412277 },
					{"x": 78.25180805870446, "y": 16.632935265420745 },
					{"x": 76.08452130361228, "y": 24.721359549995793 },
					{"x": 73.08363661140807, "y": 32.53893144606401 },
					{"x": 69.2820323027551, "y": 39.99999999999999 },
					{"x": 64.7213595499958, "y": 47.022820183397855 },
					{"x": 59.451586038191536, "y": 53.53044850870866 },
					{"x": 53.53044850870866, "y": 59.45158603819153 },
					{"x": 47.022820183397855, "y": 64.7213595499958 },
					{"x": 40.00000000000001, "y": 69.28203230275508 },
					{"x": 32.538931446064026, "y": 73.08363661140807 },
					{"x": 24.721359549995796, "y": 76.08452130361228 },
					{"x": 16.632935265420738, "y": 78.25180805870446 },
					{"x": 8.362277061412277, "y": 79.56175162946187 },
					{"x": 0, "y": 80 },
					{"x": -8.362277061412266, "y": 79.56175162946187 },
					{"x": -16.63293526542073, "y": 78.25180805870446 },
					{"x": -24.72135954999579, "y": 76.08452130361229 },
					{"x": -32.538931446064005, "y": 73.08363661140808 },
					{"x": -39.999999999999986, "y": 69.2820323027551 },
					{"x": -47.02282018339784, "y": 64.7213595499958 },
					{"x": -53.53044850870863, "y": 59.45158603819156 },
					{"x": -59.45158603819155, "y": 53.530448508708645 },
					{"x": -64.72135954999578, "y": 47.02282018339786 },
					{"x": -69.2820323027551, "y": 39.99999999999999 },
					{"x": -73.08363661140808, "y": 32.538931446064005 },
					{"x": -76.08452130361228, "y": 24.7213595499958 },
					{"x": -78.25180805870446, "y": 16.632935265420745 },
					{"x": -79.56175162946187, "y": 8.362277061412298 },
					{"x": -80, "y": 0 },
					{"x": -79.56175162946187, "y": -8.36227706141228 },
					{"x": -78.25180805870446, "y": -16.632935265420727 },
					{"x": -76.08452130361228, "y": -24.721359549995817 },
					{"x": -73.08363661140808, "y": -32.538931446063984 },
					{"x": -69.28203230275508, "y": -40.00000000000001 },
					{"x": -64.72135954999581, "y": -47.02282018339784 },
					{"x": -59.451586038191536, "y": -53.53044850870866 },
					{"x": -53.53044850870867, "y": -59.45158603819152 },
					{"x": -47.02282018339786, "y": -64.72135954999578 },
					{"x": -40.000000000000036, "y": -69.28203230275507 },
					{"x": -32.538931446064005, "y": -73.08363661140808 },
					{"x": -24.721359549995803, "y": -76.08452130361228 },
					{"x": -16.632935265420784, "y": -78.25180805870444 },
					{"x": -8.362277061412339, "y": -79.56175162946187 },
					{"x": 0, "y": -80 },
					// Force a break in the lines
					{"x": null, "y": null },
					// Draw the star inside the circle
					{"x": 0 ,"y": 80 },
					{"x": -47.02282018339786 ,"y": -64.72135954999578 },
					{"x": 76.08452130361229 ,"y": 24.721359549995775 },
					{"x": -76.08452130361228 ,"y": 24.7213595499958 },
					{"x": 47.02282018339783 ,"y": -64.72135954999581 },
					{"x": 0 ,"y": 80 },
					// Force a break in the lines
					{"x": null, "y": null },
					// Draw a Triangle inside the star
					{"x": 0 ,"y": -10 },
					{"x": -10 ,"y": 10 },
					{"x": 10 ,"y": 10 },
					{"x": 0 ,"y": -10 }

					],
      "bg_colour" : "#DFFFDF"
    }
  ],
  
  "x_axis": {
    "min":    -100,
    "max":    100,
    "offset": 0,
	"steps" : 10,
	"3d" : 0,
	"rotatation" : 2
  },

  "x_label_style": {
	"rotation" : "2",
	"visible" : "false" 
  },
  
  "y_axis": {
    "min":    -100,
    "max":    100,
	"stroke": 2,
	"steps" : 10,
    "ticks" : [25,50,75],
    "offset": 0
  }
}
;
var scatter_line_area=
{

  "title":{
    "text":"Scatter Line with Area Fill",
    "style":"{font-size: 24px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },
  "num_decimals":3,

  "elements":[
    {
      "type":      "scatter_line",
      "colour":	   "#d01f3c",
      "alpha":     0.6,
      "border":    2,
      "animate":   0,
	  "width":     3,
	  "line-style": { "style":"dash", "off":2 },
	  "text":      "Area base is line Y=0",
	  "tip":       "[#x#,#y#] #size#\nArea base is line Y=0",
	  "line-style": { "style":"solid", "off":2 },
	  "area-style": { "colour":"#b0101c", "y":0},
	  "values" :   [
					{"x": -50, "y": 80 },
					{"x": -20, "y": 20 },
					{"x": 0, "y": -40 },
					{"x": 20, "y": 20 },
					{"x": 50, "y": 80 }
					]
    },
    {
      "type":      "scatter_line",
      "colour":    "#356aa0",
      "animate":   0,
	  "dot-size":  3,
	  "text":      "Area base is line X=-80",
	  "tip":       "[#x#,#y#] #size#\nArea base is line X=-80",
	  "line-style": { "style":"solid", "off":2 },
	  "area-style": { "colour":"#104a80", "alpha":0.5, "x":-80},
	  "values" :   [
					{"x": -90, "y": -80 },
					{"x": -85, "y": -20 },
					{"x": -80, "y": 0 },
					{"x": -75, "y": 20 },
					{"x": -70, "y": 80 }
					]
    },
    {
      "type":      "scatter_line",
      "colour":    "#C79810",
      "animate":   0,
	  "dot-size":  3,
	  "text":      "Area base is point (80,-60)",
	  "tip":       "[#x#,#y#] #size#\nArea base is point (80,-60)",
	  "line-style": { "style":"solid", "off":2 },
	  "area-style": { "colour":"#A7780c", "x":80, "y":-60},
	  "values" :   [
					{"x": 70, "y": -50 },
					{"x": 75, "y": -45 },
					{"x": 85, "y": -45 },
					{"x": 90, "y": -50 },
					{"x": 90, "y": -70 },
					{"x": 85, "y": -65 },
					{"x": 75, "y": -65 },
					{"x": 70, "y": -70 },
					{"x": 70, "y": -50 }
					]
    },
    {
      "type":      "scatter_line",
      "colour":	   "#1fd03c",
      "animate":   0,
	  "dot-size":  3,
	  "halo-size": 1,
	  "text":      "Area base is line Y=-90 with gaps",
	  "tip":       "[#x#,#y#] #size#\nArea base is line Y=-90 with gaps",
	  "line-style": { "style":"solid", "off":2 },
	  "area-style": { "colour":"#10b01c", "y":-90},
	  "values" :   [
					{"x": -60, "y": -80 },
					{"x": -40, "y": -85 },
					{"x": null, "y": null },   // Create a gap in the chart
					{"x": -30, "y": -85 },
					{"x": -10, "y": -80 }
					]
    },
    {
      "type":      "scatter_line",
      "colour":	   "#d03c1f",
      "animate":   0,
	  "dot-size":  3,
	  "halo-size": 1,
	  "text":      "Area base is point (80,50) with gaps",
	  "tip":       "[#x#,#y#] #size#\nArea base is point (80,50) with gaps",
	  "line-style": { "style":"solid", "off":2 },
	  "area-style": { "colour":"#10b01c", "x":80, "y":50},
	  "values" :   [
					{"x": 70, "y": 80 },
					{"x": 90, "y": 80 },
					{"x": null, "y": null },   // Create a gap in the chart
					{"x": 100, "y": 60 },
					{"x": 100, "y": 40 },
					{"x": null, "y": null },   // Create a gap in the chart
					{"x": 90, "y": 20 },
					{"x": 70, "y": 20 },
					{"x": null, "y": null },   // Create a gap in the chart
					{"x": 60, "y": 40 },
					{"x": 60, "y": 60 }
					]
    }
  ],
  
  "x_axis": {
    "min":    -100,
    "max":    100,
    "offset": 0,
	"steps" : 10,
	"3d" : 0,
	"labels": { "rotate" : -30, "size": 10 }
  },
  
  "y_axis": {
    "min":    -100,
    "max":    100,
	"stroke": 2,
	"steps" : 10,
    "offset": 0
  }
}
;
var scatter_line_step_horizontal=
{

  "elements":[
    {
      "type":      "scatter_line",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-size":  10,
      "stepgraph" : "horizontal",
      "values" :   [
                     {"x":-4,  "y":-5 },
                     {"x":-4,  "y":-2 },
                     {"x":-4,  "y":1 },
                     {"x":3,   "y":3 },
                     {"x":3.5, "y":3.5 },
                     {"x":4.9, "y":4.9 }
                   ]
    }

  ]
}



;
var scatter_line_step_vertical=
{

  "elements":[
    {
      "type":      "scatter_line",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-size":  10,
      "stepgraph" : "vertical",
      "values" :   [
                     {"x":-4,  "y":-5 },
                     {"x":-4,  "y":-2 },
                     {"x":-4,  "y":1 },
                     {"x":3,   "y":3 },
                     {"x":3.5, "y":3.5 },
                     {"x":4.9, "y":4.9 }
                   ]
    }

  ]
}



;
var scatter_line=
{

  "elements":[
    {
      "type":      "scatter_line",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
	  /* BUG: if you comment this out no line is drawn? why? */
	  "dot-style": {"type":"solid-dot"},
      "values" :   [
                     {"x":-4,  "y":-5,  "tip":"HELLO" },
                     {"x":-4,  "y":-2,  "colour":"#FF0000" },
                     {"x":-4,  "y":1,   "dot-size":4},
                     {"x":3,   "y":3,   "dot-size":5, "type": "hollow-dot"},
                     {"x":3.5, "y":3.5, "dot-size":6},
                     {"x":4.9, "y":4.9, "dot-size":7}
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5/*,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]*/
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}



;
var scatter_on_click=
﻿{

  "elements":[
    {
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"solid-dot", "on-click":"trace:moooo"},
      "values" :   [
                     {"x":-5,  "y":-5, "tip":"HELLO" },
                     {"x":0,   "y":0,  "colour":"#FF0000" },
                     {"x":5,   "y":5,  "dot-size":20, "on-click":"trace:big dot"},
                     {"x":5,   "y":-5, "dot-size":5},
                     {"x":-5,  "y":5,  "dot-size":5},
                     {"x":0.5, "y":1,  "dot-size":15}
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5/*,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]*/
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}



;
var scatter_step_all=
{
  "elements": [
    {
      "type": "scatter_line",
      "colour": "#ff0000",
      "dot-size": 3,
      "values": [
        {
          "x": 1,
          "y": 1
        },
        {
          "x": 2,
          "y": 2
        },
        {
          "x": 3,
          "y": 1
        }
      ]
    },
    {
      "type": "scatter_line",
      "colour": "#ff0000",
      "dot-size": 3,
      "values": [
        {
          "x": 4,
          "y": 1
        },
        {
          "x": 5,
          "y": 2
        },
        {
          "x": 6,
          "y": 1
        }
      ],
      "stepgraph": "horizontal"
    },
    {
      "type": "scatter_line",
      "colour": "#ff0000",
      "dot-size": 3,
      "values": [
        {
          "x": 7,
          "y": 1
        },
        {
          "x": 8,
          "y": 2
        },
        {
          "x": 9,
          "y": 1
        }
      ],
      "stepgraph": "vertical"
    }
  ],
  "title": {
    "text": "Thu Nov 20 2008"
  }
}
;
var scatter=
{

  "elements":[
    {
      "type":      "scatter",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-style": {"type":"solid-dot"},
      "values" :   [
                     {"x":-5,  "y":-5, "tip":"HELLO" },
                     {"x":0,   "y":0,  "colour":"#FF0000" },
                     {"x":5,   "y":5,  "dot-size":20, "on-click":"trace:moooo"},
                     {"x":5,   "y":-5, "dot-size":5, "type":"hollow-dot"},
                     {"x":-5,  "y":5,  "dot-size":5},
                     {"x":0.5, "y":1,  "dot-size":15}
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5/*,"labels":["mon","tue","wed","thur","fri","sat","sun"]*/
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}



;
var shape=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "line-style": {"style":"dash","on":10,"off":5},
      "values" :   [
        6,6,
        {"value":7, "colour":"#FF0000", "tip":"LINE<br>#val#", "dot-size":12, "halo-size": 3 },
        8,8]
    },
    {
      "type":      "shape",
      "colour":    "#FF0000",
      "alpha":     0.2,
      "values" :   [
        {"x":2,"y":2},
        {"x":4,"y":2},
        {"x":4,"y":4},
        {"x":3,"y":5},
        {"x":2,"y":4}
      ]
    },
    {
      "type":      "line_dot",
      "colour":    "#736AFF",
      "text":      "Line Dot Key",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
      "tip":       "global dot<br>#val#",
      "values" :  [
        2,2,
        {"value":3, "colour":"#FF0000", "tip":"DOT<br>#val#<br>Key: #key#<br>#x_label#, #x_legend#", "dot-size":12, "halo-size": 3 },
        4,4] 
    }
  ],


  "y_axis":{
    "max":   10
  }

}
;
var stack_bar_1=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#FFB9F0", "text": "Key 2", "font-size": 16},
        {"colour":"#FFB9F0", "text": "Key 3"},
        {"colour":"#FFB9F0", "font-size": 16},
        {"text": "Key 5", "font-size": 16}
      ],

      "values" :   [
                    [2.5,{"val":5}],
                    [{"val":2.5},{"val":5},{"val":2.5}],
                    null,
                    [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff"},{"val":2},{"val":2}]
                   ]
    }
  ],

  "x_axis":{
    "max":4,
    "steps": 1,
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  }
}
;
var stack_bar_2=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "colours":   ["#FF0000","#0000FF"],
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#FFB9F0", "text": "Key 2", "font-size": 16}
      ],
      "ti--p":       "#total#<br>(bar total)",
      "values": [
        [2.5,{"val":5}],
        [{"val":2.5},{"val":5},{"val":2.5}],
        null,
        [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff","tip":"hello"},{"val":2},{"val":2}]
        ]
    },
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Bar",
      "font-size": 10,
      "values" :   [9,6,7,9]
    }
  ],

  "x_axis":{
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  }
}
;
var stack_bar_on_click=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#FFB9F0", "text": "Key 2", "font-size": 16}
      ],
	  "on-click":  "trace:http://example.com",
	  "on-show":	{"type": "drop", "delay":0.5, "cascade":0.6},
      "tip":       "#total#<br>(bar total)",
      "values": [
        [2.5,{"val":5}],
        [{"val":2.5},{"val":5},{"val":2.5}],
        null,
        [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff","tip": "Click me!", "on-click": "trace:clicked!!"},{"val":2},{"val":2}]
        ]
    },
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Bar",
      "font-size": 10,
      "values" :   [9,6,7,9]
    }
  ],

  "x_axis":{
    "max":4,
    "steps": 1,
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  },

  "tooltip":{
    "mouse": 2,
    "stroke":1
  }
}
;
var stack_bar_on_show=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#FFB9F0", "text": "Key 2", "font-size": 16}
      ],
      "tip":       "#total#<br>(bar total)",
	  "on-show":	{"type": "pop", "delay":0.5, "cascade":0.6},
      "values": [
        [2.5,{"val":5}],
        [{"val":2.5},{"val":5},{"val":2.5}],
        null,
        [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff","tip":"hello"},{"val":2},{"val":2}]
        ]
    },
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Bar",
      "font-size": 10,
	  "on-show":	{"type": "pop", "delay":0.5, "cascade":0.6},
      "values" :   [9,6,7,9]
    }
  ],

  "x_axis":{
    "max":4,
    "steps": 1,
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  },

  "tooltip":{
    "mouse": 2,
    "stroke":1
  }
}
;
var stack_bar_tooltip_hover=
{

  "title":{
    "text":"Test stacked bar charts",
    "style":"{font-size:16px;}"
  },

  "elements":[
    {
      "type":      "bar_stack",
      "keys": [
        {"colour":"#FFB900", "text": "Key 1", "font-size": 10},
        {"colour":"#FFB9F0", "text": "Key 2", "font-size": 16}
      ],
      "tip":       "#total#<br>(bar total)",
      "values": [
        [2.5,{"val":5}],
        [{"val":2.5},{"val":5},{"val":2.5}],
        null,
        [{"val":5},{"val":5},{"val":2},{"val":2},{"val":2,"colour":"#ff00ff","tip":"hello"},{"val":2},{"val":2}]
        ]
    },
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Bar",
      "font-size": 10,
      "values" :   [9,6,7,9]
    }
  ],

  "x_axis":{
    "max":4,
    "steps": 1,
    "labels": {
      "labels": ["January","February","March","April"]
    },
    "stroke": 12,
    "tick-height": 6
  },

  "y_axis":{
    "max": 20
  },

  "tooltip":{
    "mouse": 2,
    "stroke":1
  }
}
;
var tags=
{
  "title":{
    "text":  "Bars on Left Axis and Line on Right Axis",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
	{
	  "type":"tags",
	  "font":"Verdana",
	  "font-size":10,
	  "colour":"#000000",
	  "pad-x":0,
	  "pad-y":0,
	  "rotate":0,
	  "align-x":"center",
	  "align-y":"above",
	  "text":"$#y#",
	  "values":[
	            {"x":0,"y":9},
	            {"x":1,"y":6, "align-y":"below"},
	            {"x":2,"y":7},
	            {"x":3,"y":9},
	            {"x":4,"y":5},
	            {"x":5,"y":7, "font":"Arial", "bold":true},
	            {"x":6,"y":6},
	            {"x":7,"y":9},

				{"x":1,"y":13, "colour":"#0000F0", "underline": true,
				 "text":"<a href=\"http://moo.com\">Click</a>", "on-cl--ick":"http://www.google.com"
				},
				 
				{"x":1,"y":12.2, "colour":"#0000F0", "underline": true,
				 "text":"<a href=\"#\">Call JS</a>", "on-click":"trace:farts"
				},
				
				/* And one using the right axis just because we can */
	            {"x":2,"y":78,"axis":"right", "pad-y":16, "font-size":20,
				 "colour":"#00BB00","font":"Arial Black", "rotate":0,
				 "text":"Click Tag to\nGoogle!!", "on-click":"http://www.google.com"
				 }
				 
			]
	},
	{
		"type":		"arrow",
		"start":	{"x":2,"y":5},
		"end":		{"x":4,"y":7},
		"barb-length":	10,
		"colour":	"#ff00ff"
	},
    {
      "type":      "bar_glass",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text--":      "Page views",
	  "alpha":	0.6,
      "font-size--": 10,
      "values" :   [9,6,7,9,5,{"top":7,"colour":"#FF0000", "tip": "Mooo<br>#val#"},
					6,9,{"top":7, "tip":"click to google<br>#val#", "on-click":"http://www.google.com"}]
    },
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
	  "axis": "right",
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "values" :   [
        60,64,
        {"value":78, "colour":"#FF0000", "tip":"Override<br>#val#", "dot-size":12, "halo-size": 3 },
        58,50,41,41,36, 32 ]
    },
	
	// Moved this tag to be last in "elements" so it shows up 
	// on top of the bars instead of under it
	{
	  "type":"tags",
	  "font":"Verdana",
	  "font-size":10,
	  "colour":"#000000",
	  "pad-x":0,
	  "pad-y":0,
	  "rotate":0,
	  "align-x":"center",
	  "align-y":"above",
	  "text":"$#y#",
	  "values":[
	            {"x":8,"y":0.5, "rotate":270, "font-size":12,
	            "text":"click bar to\ngo to google" },
				 
	            {"x":6,"y":80, "rotate":45, "font-size":14,
	            "text":"45 degrees\n(not aligned yet)", 
	            "axis":"right", "background":"#AA99", "border":true }
			]
	}
	
  ],

	"tooltip":{
		"mouse": 0
	},

  "x_axis":{
    "stroke":       1,
    "tick_height":  10,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "labels": {
      "labels": [
		"January\n2008","February\n2008","March\n2008","April\n2008",
		"May\n2008","June\n2008","July\n2008","August\n2008","September\n2008"]
    }
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20,
	"steps":       4
  },

  "y_axis_right":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
	"grid_visible": true,
    "offset":      0,
	"steps":       20,
    "max":         100,
	"min": 0
  },

  "tooltip":{
    "text": "My Tip<br>val=#val#, top=#top#"
  }

}

;
var title_1=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size:18px; padding: 5px; text-align: left; font-family: Century Gothic; font-weight: bold;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area_hollow",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "tip":       "Hello<br>#val#",
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],

  "x_axis":{
    "max":30,
    "labels": {
      "labels": ["0.00","0.38","0.74","1.07","1.36","1.60","1.77","1.87","1.90","1.85","1.73","1.54",
              "1.28","0.98","0.64","0.27","-0.11","-0.49","-0.84","-1.16","-1.44","-1.66","-1.81",
              "-1.89","-1.89","-1.82","-1.68","-1.47","-1.20","-0.88"]
    }
  },

  "y_axis":{
    "min": -2,
    "max": 2
  }
}
;
var tooltip_1=
{

  "title":{
    "text":"Custom tooltip",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,9]
    }
  ],
  "x_axis":{
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
  },
  "y_axis":{
    "max":20
  },
  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}

/*

&y_legendx=Open Flash Chart,12,0x736AFF&
&x_axis_steps=2&

*/
;
var tooltip_2=
{

  "title":{
    "text":"Custom tooltip",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,9],
      "tip":       "!!!<br>#val#<br>#x_label#"
    }
  ],
  "x_axis":{
    "labels":{
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
  },
  "y_axis":{
    "max":20
  },
  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}
;
var tooltip_bar_floating=
{
  "title": {
    "text": "Fri Jul 11 2008"
  },
  "elements": [
    {
      "type": "bar",
      "values": [
        130,
        180,
        200,
        {
          "top": 170
        },
        {
          "top": 130,
          "colour": "#000000",
          "tip": "Hello<br>#top#"
        },
        null,
        150
      ]
    },
    {
      "type": "bar_filled",
      "values": [
        140,
        190,
        180,
        140,
        {
          "top": 200,
          "bottom": 150,
"tip":"#top# - #bottom#"
        },
        160,
        130
      ],
      "colour": "#FFEF3F"
    }
  ],
  "bg_colour": "#FFFFFF",
  "y_axis": {
    "min": 100,
    "max": 200,
    "steps": 10
  },

  "tooltip":{
    "mouse": 1,
    "stroke":1,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}
;
var tooltip_clash_scatter_2=
/*

many points from a single set in the same location
many points from different sets in the same location

*/

{

  "elements":[
    {
      "type":      "scatter_line",
      "dot-size":  10,
      "tip":       "Scatter 1<br>#x#, #y#",
      "colour":    "#000000",
      "values" :   [
                     {"x":-4,  "y":-5,  "tip":"HELLO 1" },
                     {"x":-4,  "y":-2,  "colour":"#FF0000" },
                     {"x":-4,  "y":1,   "dot-size":4},
                     {"x":3,   "y":3,   "dot-size":5},
                     {"x":3,   "y":3,   "colour":"#FF00FF", "dot-size":3},
                     {"x":3.5, "y":3.5, "dot-size":6},
                     {"x":4.9, "y":4.9, "dot-size":7}
                   ]
    },
    {
      "type":      "scatter",
      "dot-size":  10,
      "tip":       "Scatter 2<br>#x#, #y#",
      "colour":    "#000000",
      "values" :   [
                     {"x":-4,  "y":-5,  "tip":"HELLO 2" },
                     {"x":-4,  "y":-2  },
                     {"x":-4,  "y":-2, "dot-size":3 },
                     {"x":3,   "y":3,  "colour":"#FF00FF"}
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5/*,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]*/
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}



;
var tooltip_clash_scatter_hover=
/*

many points from a single set in the same location
many points from different sets in the same location

tooltip is set to hover -- is this a bug??

*/

{
  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },

  "elements":[
    {
      "type":      "scatter_line",
      "dot-size":  10,
      "tip":       "Scatter 1<br>#x#, #y#",
      "colour":    "#000000",
      "values" :   [
                     {"x":0,  "y":0,  "tip":"HELLO 1" },
                     {"x":1,  "y":0 }
                   ]
    },
    {
      "type":      "scatter",
      "dot-size":  7,
      "tip":       "Scatter 2<br>#x#, #y#",
      "colour":    "#600060",
      "values" :   [
                     {"x":0,  "y":0,  "tip":"HELLO 2" },
                     {"x":2,  "y":0  }
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  },

  "tooltip":{
    "mouse": 2,
    "stroke":1
  }
}



;
var tooltip_clash_scatter=
/*

many points from a single set in the same location
many points from different sets in the same location

*/

{

  "elements":[
    {
      "type":      "scatter_line",
      "dot-size":  10,
      "tip":       "Scatter 1<br>#x#, #y#",
      "colour":    "#000000",
      "values" :   [
                     {"x":-4,  "y":-5,  "tip":"HELLO 1" },
                     {"x":-4,  "y":-2,  "colour":"#FF0000" },
                     {"x":-4,  "y":1,   "dot-size":4},
                     {"x":3,   "y":3,   "dot-size":5},
                     {"x":3,   "y":3,   "colour":"#FF00FF", "dot-size":3},
                     {"x":3.5, "y":3.5, "dot-size":6},
                     {"x":4.9, "y":4.9, "dot-size":7}
                   ]
    },
    {
      "type":      "scatter",
      "dot-size":  10,
      "tip":       "Scatter 2<br>#x#, #y#",
      "colour":    "#000000",
      "values" :   [
                     {"x":-4,  "y":-5,  "tip":"HELLO 2" },
                     {"x":-4,  "y":-2  },
                     {"x":-4,  "y":-2, "dot-size":3 },
                     {"x":3,   "y":3,  "colour":"#FF00FF"}
                   ]
    }

  ],

  "x_axis":{
    "offset":  false,
    "min":     -5,
    "max":    5/*,
    "labels":["mon","tue","wed","thur","fri","sat","sun"]*/
  },

  "y_axis":{
    "min": -5,
    "max": 5
  },

  "y_legend":{
    "text":   "Time of day",
    "style": "{font-size: 20px; color: #736AFF;}"
  }
}



;
var tooltip_clash=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#FF0000",
      "width":     2,
      "dot-size":  4,
      "halo-size": 0,
      "tip":       "#val#<br>Red [#x_label#]",
      "values" :   [7,6,7,8,8]
    },
    {
      "type":      "line_hollow",
      "colour":    "#00FF00",
      "width":     2,
      "dot-size":  4,
      "halo-size": 2,
      "tip":       "#val#<br>Green [#x_label#]",
      "values" :   [7,8,7,6,6]
    },
    {
      "type":      "line_dot",
      "colour":    "#0000FF",
      "width":     2,
      "dot-size":  4,
      "halo-size": 2,
      "tip":       "#val#<br>Blue [#x_label#]",
      "values" :   [3,4,7,3,3]
    }
  ],


  "y_axis":{
    "max":   10
  }

}
;
var tooltip_hover=
{
  "y_legend":{
    "text":   "Time of day",
    "style": "{color: #736AFF;}"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "mouse": 2,
    "stroke":1
  },
  
  "y_axis":{
    "max":   3
  }

}
;
var tooltip_mixed_1=
{
  "title":{
    "text":  "TOOLTIP: CLOSEST",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
      "values" :   [4,9,6,7,9,5,7,6,9]
    },
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
	  "dot-style": {
			"type":"hollow-dot", "dot-size": 4, "halo-size": 2 },
      "values" :   [
        14,14,
        {"value":15, "colour":"#FF0000", "tip":"HOLLOW<br>#val#", "dot-size":12, "halo-size": 3 },
        16,18]
    },
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Line Dot Key",
      "font-size": 10,
      "width":     2,
	  "dot-style": {
				"type":"dot", "dot-size": 4,
				"tip":"global dot<br>#val#" },
      "values" :  [
        null,null,null,null,
        12,12,
        {"value":13, "colour":"#FF0000", "tip":"DOT<br>#val#<br>Key: #key#<br>Label: #x_label#, #x_legend#", "dot-size":12, "halo-size": 3 },
        14,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": {
		"labels": ["January","February","March","April","May","June","July","August","Spetember"]
	}
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  }

}

;
var tooltip_mixed_2=
{
  "title":{
    "text":  "TOOLTIP: HOVER",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "y_legend":{
    "text": "Open Flash Chart",
    "style": "{color: #736AFF; font-size: 12px;}"
  },

  "elements":[
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,7]
    },
    {
      "type":      "bar",
      "alpha":     0.5,
      "colour":    "#CC9933",
      "text":      "Page views 2",
      "font-size": 10,
      "tip":       "#x_label#: #val#<br>#key#",
      "values" :   [4,9,6,7,9,5,7,6,9]
    },
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 2,
      "values" :   [
        14,14,
        {"value":15, "colour":"#FF0000", "tip":"HOLLOW<br>#val#", "dot-size":12, "halo-size": 3 },
        16,18]
    },
    {
      "type":      "line_dot",
      "colour":    "#736AFF",
      "text":      "Line Dot Key",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
      "tip":       "global dot<br>#val#",
      "values" :  [
        null,null,null,null,
        12,12,
        {"value":13, "colour":"#FF0000", "tip":"DOT<br>#val#<br>Key: #key#<br>#x_label#, #x_legend#", "dot-size":12, "halo-size": 3 },
        14,9]
    }
  ],

  "x_axis":{
    "stroke":1,
    "tick_height":10,
    "colour":"#d000d0",
    "grid_colour":"#00ff00",
    "labels": {
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
   },

  "y_axis":{
    "stroke":      4,
    "tick_length": 3,
    "colour":      "#d000d0",
    "grid_colour": "#00ff00",
    "offset":      0,
    "max":         20
  },

  "tooltip":{
    "mouse": 1
  }

/* &x_axis_steps=2& */

}

;
var tooltip_rounded=
{

  "title":{
    "text":"Custom tooltip",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,9],
      "tip":       "!!!<br>#val#<br>#x_label#"
    }
  ],
  "x_axis":{
    "labels":{
      "labels": ["January","February","March","April","May","June","July","August","Spetember"]
    }
  },
  "y_axis":{
    "max":20
  },
  "tooltip":{
    "shadow":false,
    "stroke":5,
    "rounded": 12,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}
;
var tooltip_x_radar_clash_proximity=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "area_line",
      "colour":    "#FA3D37",
      "fill":      "#FA3D37",
      "fill-alpha": 0.3,
      "text":      "Orange",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Orange<br>#val#",
      "loop":      true,
      "values" :   [2,2,2,2,2,2,2]
    },
    {
      "type":      "area_line",
      "colour":    "#3D37FA",
      "fill":      "#3D37FA",
      "fill-alpha": 0.3,
      "text":      "Blue",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Blue<br>#val#",
      "loop":      true,
      "values" :   [{"value":3, "tip":"3 Accuratesse"},3,3,1.5,1,2,3]
    }
  ],

  
  "radar_axis": {
    "max":         4,
    "stroke":      1,
    "colour":      "#909090",
    "grid-colour": "#C0DEBF",
    "steps":       4,

    "labels":{
      "colour"  :"#000000",
      "labels": [
        "0","1","2","3","4"
      ]
    },

    "spoke-labels":{
      "colour":  "#000000",
      "labels":  ["Accuratesse","Analystich<br>vermogen","Creativiteit","Plannen en<br>organiseren","Probleemanalyse","Samenwerken in<br>teamverband","Zelfstandigheid"]
    }
  },

  "tooltip":{
    "mouse": 1,
    "stroke":1
  }
}
;
var tooltip_x_radar_clash=
{
  "title":{
    "text":"Ahhhh, sweet.",
    "style":"{font-size: 13px;}"
  },

  "elements":[
    {
      "type":      "area_line",
      "colour":    "#FA3D37",
      "fill":      "#FA3D37",
      "fill-alpha": 0.3,
      "text":      "Orange",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Orange<br>#val#",
      "loop":      true,
      "values" :   [2,2,2,2,2,2,2]
    },
    {
      "type":      "area_line",
      "colour":    "#3D37FA",
      "fill":      "#3D37FA",
      "fill-alpha": 0.3,
      "text":      "Blue",
      "width":     1,
      "font-size": 10,
      "dot-size":  3,
      "halo-size": 1,
      "tip":       "Blue<br>#val#",
      "loop":      true,
      "values" :   [{"value":3, "tip":"3 Accuratesse"},3,3,1.5,1,2,3]
    }
  ],

  
  "radar_axis": {
    "max":         4,
    "stroke":      1,
    "colour":      "#909090",
    "grid-colour": "#C0DEBF",
    "steps":       4,

    "labels":{
      "colour"  :"#000000",
      "labels": [
        "0","1","2","3","4"
      ]
    },

    "spoke-labels":{
      "colour":  "#000000",
      "labels":  ["Accuratesse","Analystich<br>vermogen","Creativiteit","Plannen en<br>organiseren","Probleemanalyse","Samenwerken in<br>teamverband","Zelfstandigheid"]
    }
  }
}
;
var utf8_1=
{

  "title":{
    "text":"&#x20AC;&#xA3;€",
    "style":"{font-size: 20px; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "text":      "Page views",
      "font-size": 10,
      "values" :   [9,6,7,9,5,7,6,9,9]
    }
  ],
  "x_axis":{
    "labels": ["January","February","March","April","May","June","July","August","Spetember"]
  },
  "y_axis":{
    "max":20
  },
  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}

/*

&y_legendx=Open Flash Chart,12,0x736AFF&
&x_axis_steps=2&

*/
;
var x_axis_1=
{

  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 1,

    "labels":{
      "visible": true,
      "rotate": "vertical",
      "steps":  2
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_axis_auto_range=
{
  "elements": [
    {
      "type": "line",
      "values": [
        1,
        2,
        1,
        null,
        null,
        null,
        null,
        null,
        null,
        null
      ]
    },
    {
      "type": "line",
      "values": [
        null,
        null,
        null,
        1,
        2,
        1,
        null,
        null,
        null,
        null
      ]
    },
    {
      "type": "line",
      "values": [
        null,
        null,
        null,
        null,
        null,
        null,
        1,
        2,
        1
      ]
    }
  ],
  "title": {
    "text": "Thu Nov 20 2008"
  }
}
;
var x_axis_big=
{
	"elements":[
	{
		"type":"scatter",
		"colour":"#FF0000",
		"outline-colour":"#577261",
		"dot-style": {
			"type":"anchor", "sides":4,
			"alpha":1, "hollow":true,
			"background-colour":"#a44a80", "background-alpha": 0.4,
			"width":1, "tip":"X: #x_label#" },
		"values":[
			{"x":0,"y":0},
			{"x":20000,"y":0},
			{"x":20000,"y":20000},
			{"x":0,"y":20000}
		]
	}
	],
	
	"title":{
		"text":"adsfasdfasdf"
		},
		
	"bg_colour":"#FFFFFF",
	
	"x_axis":{
		"grid-colour":"#FFFFFF",
		"colour":"#000000",
		"min":0,
		"max":20000,
		"steps":3000,
		"labels": {
			"_visible": true,
			"_colour":	"#f09090",
			"steps":	3000,
			"_size" :	15,
			"_align":	"right",
			"rotate":	45,
			"visible-steps": 3000
		}
	},
	
	"y_axis":{
		"grid-colour":"#FFFFFF",
		"colour":"#000000",
		"min":0,
		"max":20000,
		"steps":2500
	}
}
;
var x_axis_labels_2=
{

  "title":{
    "text":"Portreath beach",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 4,

    "labels":{
      "visible": true,
      "rotate": "vertical",
      "steps":  1,
      "labels": [
        "1",
        "2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello",
        {"text":"Long text 1","colour":"#00D0D0", "rotate": "diagonal"},       /* override parent */
        {"text":"Long text 2","colour":"#00D0D0", "rotate": "moo", "size":30}, /* should default to horizontal */
        {"text":"Long text 3","colour":"#D000D0", "size":10}                   /* inherit and become vertical */
      ]
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_axis_labels_3=
{

  "title":{
    "text":"Portreath beach",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 4,

    "labels":{
      "visible":  true,
      "rotate":   "vertical",
      "steps":    2,
      "size":     16,
      "labels": [
        "1",
        "2",
        {"text":"3","colour":"#00D000"},
        "4",
        "5 Hello",
        {"text":"Long text 1","colour":"#00D0D0", "visible": true},
        "Long text 2",
        "Long text 3"
      ]
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_axis_labels_4=
{
  "title": {
    "text": "Our New House Schedule"
  },
  "elements": [
    {
      "type": "hbar",
      "colour": "#9933CC",
      "text": "Page views",
      "font-size": 10,
      "values": [
        {
          "right": 4
        },
        {
          "right": 4,
          "left": 8
        },
        {
          "right": 8,
          "left": 11
        }
      ]
    }
  ],
  "y_axis": {
    "offset": 1,
    "labels": [
      "Make garden look sexy",
      "Paint house",
      "Move into house"
    ]
  },
  "x_axis": {
    "offset": false,
    "labels": {
      "labels": [
        "Jan",
        "Feb",
        "Mar",
        "Apr",
        "May",
        "Jun",
        "Jul",
        "Aug",
        "Sep",
        "Oct",
        "Nov",
        "Dec"
      ]
    }
  }
}
;
var x_axis_labels_5=
{
  "title": {
    "text": "Too few labels check"
  },
  "elements": [
    {
      "type": "hbar",
      "colour": "#9933CC",
      "text": "Page views",
      "font-size": 10,
      "values": [
        {
          "right": 4
        },
        {
          "right": 4,
          "left": 8
        },
        {
          "right": 8,
          "left": 11
        }
      ]
    }
  ],
  "y_axis": {
    "offset": 1,
    "labels": [
      "Make garden look sexy",
      "Paint house",
      "Move into house"
    ]
  },
  "x_axis": {
    "offset": false,
    "labels": {
      "labels": [
        "Jan",
        "Feb"
      ]
    }
  }
}
;
var x_axis_labels_6=
{
  "title": {
    "text": "Our New House Schedule"
  },
  "elements": [
    {
      "type": "hbar",
      "colour": "#9933CC",
      "text": "Page views",
      "font-size": 10,
      "values": [
        {
          "right": 4
        },
        {
          "right": 4,
          "left": 8
        },
        {
          "right": 8,
          "left": 11
        }
      ]
    }
  ],
  "y_axis": {
    "offset": 1,
    "labels": [
      "Make garden look sexy",
      "Paint house",
      "Move into house"
    ]
  },
  "x_axis": {
    "offset": false,
    "labels": {

      "rotate": -24,

      "labels": [
        "January",
        {"text":"February","rotate":45},
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        {"text":"November","rotate":350},
        "December"
      ]
    }
  }
}
;
var x_axis_labels_7=
{ 
	"elements": [
		{
			"type":		"line_dot",
			"values":	[ 9, 8, 7, 6, 5, 4, 3, 2, 1 ],
			"tip":		"#val# cccc<br>#x_label# cccc"
		}
	],
	
	"title": { "text": "X Axis Labels Complex Example" },
	
	"x_axis": {
		"stroke": 1,
		"colour": "#428C3E",
		"tick-height": 5,
		"grid-colour": "#86BF83",
		"steps": 1,
		"labels": {
			"steps": 2,
			"rotate": "vertical",
			"colour": "#ff0000",
			"size": 16,
			"labels": [
				"one",
				"two",
				"three",
				"four",
				"five",
				{ "text": "six", "colour": "#0000FF", "size": 30, "rotate": 90 },
				{ "text": "seven", "colour": "#0000FF", "size": 30, "rotate": 180 },
				{ "text": "eight", "colour": "#8C773E", "size": 16, "rotate": 35, "visible": true },
				{ "text": "nine", "colour": "#2683CF", "size": 16, "rotate": 0 }
			]
		}
	}
}
;
var x_axis_labels_angle_no_offset=
{
  "title": {
    "text": "Our New House Schedule"
  },
  "elements": [
    {
      "type": "hbar",
      "colour": "#9933CC",
      "text": "Page views",
      "font-size": 10,
      "values": [
        {
          "right": 4
        },
        {
          "right": 4,
          "left": 8
        },
        {
          "right": 8,
          "left": 11
        }
      ]
    }
  ],
  "y_axis": {
    "offset": 1,
    "labels": [
      "Make garden look sexy",
      "Paint house",
      "Move into house"
    ]
  },
  "x_axis": {
    "offset": false,
    "labels": {
	  "align":"center",
      "labels": [
        {"text":"January 0","rotate":0},
		{"text":"January 30","rotate":30},
        {"text":"January 60","rotate":60},
        {"text":"January 90","rotate":90},
        {"text":"January 120","rotate":120},
        {"text":"January 150","rotate":150},
		{"text":"January 180","rotate":180},
        {"text":"January 210","rotate":210},
        {"text":"January 240","rotate":240},
        {"text":"January 270","rotate":270},
        {"text":"January 300","rotate":300},
        {"text":"January 330","rotate":330},
        {"text":"January 360","rotate":360}
      ]
    }
  }
}
;
var x_axis_labels_angle_offset=
{
  "title": {
    "text": "Our New House Schedule"
  },
  "elements": [
    {
      "type": "hbar",
      "colour": "#9933CC",
      "text": "Page views",
      "font-size": 10,
      "values": [
        {
          "right": 4
        },
        {
          "right": 4,
          "left": 8
        },
        {
          "right": 8,
          "left": 11
        }
      ]
    }
  ],
  "y_axis": {
    "offset": 1,
    "labels": [
      "Make garden look sexy",
      "Paint house",
      "Move into house"
    ]
  },
  "x_axis": {
    "offset": true,
    "labels": {
	  "align":"center",
      "labels": [
        {"text":"January 0","rotate":0},
		{"text":"January 30","rotate":30},
        {"text":"January 60","rotate":60},
        {"text":"January 90","rotate":90},
        {"text":"January 120","rotate":120},
        {"text":"January 150","rotate":150},
		{"text":"January 180","rotate":180},
        {"text":"January 210","rotate":210},
        {"text":"January 240","rotate":240},
        {"text":"January 270","rotate":270},
        {"text":"January 300","rotate":300},
        {"text":"January 330","rotate":330},
        {"text":"January 360","rotate":360}
      ]
    }
  }
}
;
var x_axis_labels=
{

  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 4,

    "labels":{
      "visible": true,
      "rotate": "vertical",
      "steps":  2
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_axis_no_offset=
{

  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps":  1,
    "offset": false,

    "labels":{
      "visible": true,
      "rotate": "vertical",
      "steps":  2
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_axis_range_scatter_minus=
{

  "elements":[
    {
      "type":      "scatter_line",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-size":  10,
      "values" :   [
                     {"x": 5,  "y":-5 },
                     {"x": 3,  "y":-2 },
                     {"x": 2.5,  "y": 1 },
                     {"x": 1,  "y": 3 },
                     {"x": 0,  "y": 3.5 },
                     {"x":-5,  "y": 4.9 }
                   ]
    }

  ],

  "x_axis":{
    "steps": 1,

    "labels":{
      "visible": true,
      "rotate": "vertical"
    }
  },

  "y_axis":{
    "min": -5,
    "max": 5
  }
}



;
var x_axis_range_scatter_plus=
{

  "elements":[
    {
      "type":      "scatter_line",
      "colour":    "#FFB900",
      "text":      "Avg",
      "font-size": 10,
      "dot-size":  10,
      "values" :   [
                     {"x":9,  "y":3 },
                     {"x":3,  "y":3 },
                     {"x":7,  "y":3 },
                     {"x":8,  "y":5 }
                   ]
    }

  ],

  "x_axis":{
    "steps": 1,

    "labels":{
      "visible": true,
      "rotate": "vertical"
    }
  },

  "y_axis":{
    "min": -5,
    "max": 5
  }
}



;
var x_axis_steps_zero_check=
{

  "title":{
    "text":"Calculate Range",
    "style":"{color: #736AFF; font-size: 25;}"
  },


  "elements":[
    {
      "type":      "line",
      "colour":    "#87421F",
      "width":     3,
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,
                    2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,
                    0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,
                    1.81,1.99,2.15,2.29,2.39,2.46,2.49]
    }
  ],

  "y_axis":{
    "max":   3,
    "colour":       "#FF0000",
    "grid-colour":  "#FF0000"
  },

  "x_axis":{
    "steps": 0,

    "labels":{
      "visible": true,
      "rotate": "vertical",
      "steps":  2
    }
  },

  "bg_colour":  "#F8F8F8"
}
;
var x_labels_auto_dates=
{
  "title":{
    "text":"X Labels - Auto Dates - Every 2nd Visible",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis": {
    "min": 1220245200,
    "max": 1221368400,
    "steps": 86400,        // <-- seconds in a day
    "labels":{
      "rotate":345,
      "steps":86400,
      "visible-steps":2,
      "text":"#date:l jS, M Y#"      // <-- apply default date format to X axis labels
    }
  },

  "elements":[
    {
      "type":      "scatter_line",
      "colours":   ["#1f3cd0"],
      "alpha":     0.6,
      "border":    2,
      "animate":   0,
	  "dot-style": {
		  "tip":       "#date:d M y#<br>#y#\n(left axis)",     // User formatted date
		  "type":"solid-dot"},
		
      "width": 4,
      "text":      "Test with Unix Timestamp as X Value",
      "values" :   [
            {"x":1220245200, "y":10}, // 1220245200 = unix time stamp for 01 Sep 2008
            {"x":1220331600, "y":20},
            {"x":1220418000, "y":30},
            {"x":1220504400, "y":40},
            {"x":1220590800, "y":50},
            {"x":1220677200, "y":60},
            {"x":1220763600, "y":70},
            // skip a day -- {"x":1220850000, "y":80},
            {"x":1220936400, "y":70},
            {"x":1221022800, "y":60},
            {"x":1221109200, "y":50},
            {"x":1221195600, "y":40},
            {"x":1221282000, "y":30},
            {"x":1221368400, "y":20}
          ]
      }
    ],
  
  "tooltip":{
    "shadow":false,
    "stroke":2,
    "mouse":0,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}",
    "text":"title<br>body"
  },
	
  "y_axis": {
    "min":    0,
    "max":    100,
    "stroke": 2,
    "steps" : 10,
    "offset": 0
  }
}
;
var x_labels_auto_min5_3rd_visible=
{
  "title":{
    "text":"X Labels - Auto w/ Min = 5 - Formatted and Display Every 3rd Label",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

	"x_axis":{
		"min":5,
		"max":49,
		"steps": 3,		// grid lines for every third point
		"labels": {
			"rotate":315, 
			"text":"Label $#val#.00%",	// format for the label
			"steps":1,				// save every label text (tooltip)
			"visible-steps":3		// but show every 3rd one
		}   
	},

	"elements":[
		{
			"type":      "line",
			"colour":    "#736AFF",
			"width":     2,
			"dot-style": { "type":"hollow", "tip":"X: #x_label#" },
			"tip": "#x_label#<br>#val#",
			"values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
		}
	],

  "tooltip":{
    "shadow":false,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
    "max":   3
  }

}
;
var x_labels_auto_min5=
{
  "title":{
    "text":"X Labels - Auto with Minimum = 5 (must specify max also)",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{ "min":5, "max":50 },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "y_axis":{
    "max":   3
  }

}
;
var x_labels_auto_rev=
{
  "title":{
    "text":"X Labels - Auto with Reversed Axis",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{ "min":49, "max":5, "offset":true, "labels":{"visible-steps":2,"rotate":270 }}, 

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
    "max":   3
  }

}
;
var x_labels_auto=
{
  "title":{
    "text":"X Labels - Simple Automatic Generation"
  },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "y_axis":{
    "max":   3
  }

}
;
var x_labels_invisible_user_labels=
{
  "title":{
    "text":"X Labels - Auto with Min=5 - Invisible Labels",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

	"x_axis":{
		"steps": 1,
		"labels": {
			"visible":false,
			"labels":["a:[#val#]","b:[#val#]","c:[#val#]"]
		}
	},

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [3,4,5]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
    "max":   8
  }

}
;
var x_labels_invisible=
{
  "title":{
    "text":"X Labels - Auto with Min=5 - Invisible Labels",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{ "steps": 1, "min" : 5, "max":50, "labels": { "visible":false } },

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
    "max":   3
  }

}
;
var x_labels_user_labels_br=
{
  "title":{
    "text":"X Labels - User Supplied Labels",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{
	  "labels" : {
		  "labels":["2:00am<br>line 2<br>line 3","","","","2:40","2:50",
				  "3:00am","3:10","3:20","3:30","3:40","3:50",
				  "4:00am","4:10","4:20","4:30","4:40","4:50",
				  "5:00am","5:10","5:20","5:30","5:40","5:50",
				  "6:00am","6:10","6:20","6:30","6:40","6:50",
				  "7:00am","7:10","7:20","7:30","7:40","7:50",
				  "8:00am","8:10","8:20","8:30","8:40","8:50",
				  "9:00am","9:10","9:20"]
	  }
  },
  
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
       "dot-style":    { "hollow":true, "background-colour":"#a44a80", 
						"background-alpha": 0.4, "width":1, "tip":"#x_label#<br>#val#" },
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
	"steps": 1,
	"min":  0,
    "max":  3
  }

}
;
var x_labels_user_labels=
{
  "title":{
    "text":"X Labels - User Supplied Labels",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{
	  "labels" : { "rotate":270,
		  "labels":["2:00am","2:10","2:20","2:30","2:40","2:50",
				  "3:00am","3:10","3:20","3:30","3:40","3:50",
				  "4:00am","4:10","4:20","4:30","4:40","4:50",
				  "5:00am","5:10","5:20","5:30","5:40","5:50",
				  "6:00am","6:10","6:20","6:30","6:40","6:50",
				  "7:00am","7:10","7:20","7:30","7:40","7:50",
				  "8:00am","8:10","8:20","8:30","8:40","8:50",
				  "9:00am","9:10","9:20"]
	  }
  },
  
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
       "dot-style":    { "hollow":true, "background-colour":"#a44a80", 
						"background-alpha": 0.4, "width":1, "tip":"#x_label#<br>#val#" },
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
	"steps": 1,
	"min":  0,
    "max":  3
  }

}
;
var x_labels_user_x=
{
  "title":{
    "text":"X Labels - Min 5 - User Specified Locations Formatted",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

	"x_axis":{
		"steps": 1, "min" : 5, "max":50,
		"labels": {
			"text":"lbl #val#",
			"labels": [
				{"x":6},
				{"x":14},
				{
					"x":31,
					"text":"override #val#",
					"grid-colour":"#FF0000",
					"colour":"#d00000",
					"rotate": 45,
					"size":14,
					"align":	"center"
				}
			]
		}
	},

  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  },

  "y_axis":{
    "max":   3
  }

}
;
var y_axis_auto_steps=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [0,30000,40000,50000]
    }
  ],

	"y_axis":{
		"stroke":       1,
		"tick-length":  10,
		"colour":       "#202020",
		"grid-colour":  "#00ff00",
		"grid-visible": false,
		"offset":       false,
		"visible":      true,
		"labels": {
	  		"text":	"left #val#", 
			"colour":"#DD30DD",
			"size":12
			}
	}

}
;
var y_axis_big=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [0,30000,40000,50000]
    }
  ],

	"y_axis":{
		"stroke":       1,
		"tick-length":  10,
		"colour":       "#202020",
		"grid-colour":  "#00ff00",
		"grid-visible": false,
		"offset":       false,
		"max":          100000,
		"visible":      true,
		"steps":        2,	/* <-- ERROR: this gets changed by the chart */
		"labels": {
			"text":		"left #val#", 
			"colour":	"#DD30DD",
			"size":		12
		}
	}

}
;
var y_axis_fix_this_bug=
﻿{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [1000,2000,5000,10000,20000,30000,39000]
    }
  ],


  "y_axis":{
    "max":          40000,
    "steps":        10000,
	"labels": {
		"text": "£$#val#%"
	}
  },
  
	"num_decimals": 3,
	"is_fixed_num_decimals_forced": true,
	"is_decimal_separator_comma": true,
	"is_thousand_separator_disabled": true

}
;
var y_axis_format_labels=
﻿{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],


  "y_axis":{
    "stroke":       1,
    "tick-length":  3,
    "colour":       "#d09090",
    "grid-colour":  "#00ff00",
    "max":          40000,
    "visible":      true,
    "steps":        10000
  },
  
	"num_decimals": 3,
	"is_fixed_num_decimals_forced": true,
	"is_decimal_separator_comma": true,
	"is_thousand_separator_disabled": true

}
;
var y_axis_labels_step=
{
  "elements": [
    {
      "type": "bar",
      "values": [ 6, 10, 12.5, 6, 9 ],
      "tip": "Fund 1 Value:#val#",
      "colour": "#fff100",
      "text": "Fund 1",
      "font-size": 12
    },
    {
      "type": "bar",
      "values": [ 4, -6, 3, 3, 6.4 ],
      "tip": "Fund 2 Value:#val#",
      "colour": "#ff0000",
      "text": "Fund 2",
      "font-size": 12
    },
    {
      "type": "line",
      "values": [ 8, 9, 10, 4, 5.1 ],
      "halo-size": 0,
      "width": 2,
      "dot-size": 5,
      "colour": "#000000",
      "text": "S&P 500",
      "font-size": 12
    },
    {
      "type": "shape",
      "colour": "#ff0000",
      "values": [ { "x": -0.5, "y": 0 }, { "x": 5, "y": 0 }, { "x": 5, "y": -0.1 }, { "x": -0.5, "y": -0.1 } ]
    }
  ],

  "title": {
    "text": "Example Chart",
    "style": "{font-size: 18px; color: #ff0000;font-weight: bold;padding: 10px; text-align: center;font-family: Verdana, Arial;}"
  },

  "bg_colour": "#ffffff",

  "x_axis":
  {
    "colour": "#ffffff",
    "grid-colour": "#ffffff",
    "labels": { "colour": "#ff0000" }
  },

  "y_axis":
  {
    "min": -8,
    "max": 16,
    "steps": 2,
    "grid-colour": "#ffffff",
    "colour": "#CCCCCC",
    "labels":{
		"labels":[ "-8%", "error", "-6%", "x", "-4%", "x", "-2%", "x", "0%", "x", "2%", "x", "4%", "x", "6%", "x", "8%", "x", "10%", "x", "12%", "x", "14%", "x", "16%" ]
	}
  },

  "y_legend":
  {
    "text": "Percentage of Gain\/Loss",
    "style": "{font-size: 14px; color: #ff0000;padding: 5px;font-family: Verdana, Arial;}"
  }
}
;
var y_axis_labels_user_y=
{
  "title":{
    "text":"Y Labels - User Specified Locations",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis_":{ "steps": 5 },

	"y_axis":{
		"min" : 0, "max":3,
		"rotate":"vertical",
		"labels": {
			"text":"left #val#", 
			"colour":"#DD30DD",
			"size":12,
			"labels": [
				{"y":0.25}, 
				{"y":1.685}, 
				{"y":2.45, "text":"override #val#", "colour":"#44AA44", "size":10, "rotate":30},
				{"y":3}
			]
		}
	},
  
	"y_axis_right":{
		"min" : 0, "max":10,
		"rotate":"vertical",
		"labels": {
			"text":"right #val#", 
			"colour":"#30AA30",
			"size":10,
			"labels": [
				{"y":0},
				{"y":5},
				{"y":7.5, "text":"7.5: #val#", "colour":"#4444AA", "size":12, "rotate":""},
				{"y":10}
			]
		}
	},
  
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
	  "tip":		"#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    },
	{
      "type":      "line",
      "colour":    "#6A7300",
      "width":     2,
	  "tip":		"#x_label#<br>#val#",
	  "axis":		"right",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":false,
    "stroke":5,
    "colour":"#00d000",
    "background":"#d0d0ff",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}
;
var y_axis_no_grid=
{
	"title":{
		"text":"Area Chart",
		"style":"{font-size: 30px;}"
	},

	"y_legend":{
		"text":"OFC",
		"style":"{font-size: 12px; color:#736AFF;}"
	},

	"elements":[
		{
			"type":      "area",
			"colour":    "#CC3399",
			"fill":      "#343399",
			"fill-alpha": 0.5,
			"text":      "Page views",
			"width":     3,
			"font-size": 10,
			"dot-size":  7,
			"values" :   [
				0,0.37,0.73,1.07,1.36,1.59,1.77,
				1.87,1.89,1.85,1.72,1.53,1.28,0.97,
				0.63,0.26,-0.11,-0.48,-0.84,-1.16,
				-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,
				-1.67,-1.46,-1.19,-0.88]
		}
	],

	"y_axis":{
		"stroke":       4,
		"tick-length":  10,
		"colour":       "#d09090",
		"grid-colour":  "#00ff00",
		"grid-visible": false,
		"offset":       false,
		"min":         -4,
		"max":          4,
		"visible":      true,
		"steps":        2
	}
}
;
var y_axis_no_title_no_offset_right=
{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "width":     3,
      "dot-size":  7,
	  "axis":      "right",
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],
"y_axis_right":{
		"stroke":       1,
		"tick-length":  3,
		"colour":       "#d09090",
		"grid-colour":  "#00ff00",
		"offset":       false,
		"min":         -4,
		"max":          4,
		"visible":      true,
		"steps":        1		
	},
	
	"y_axis":{
		"visible":      false
	}
  
}
;
var y_axis_no_title_no_offset=
{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "width":     3,
      "dot-size":  7,
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],
	"y_axis":{
    "stroke":       1,
    "tick-length":  3,
    "colour":       "#d09090",
    "grid-colour":  "#00ff00",
    "offset":       false,
    "min":         -4,
    "max":          4,
    "visible":      true,
    "steps":        1
  }


}
;
var y_axis_no_title_offset=
{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "width":     3,
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],

  "y_axis":{
    "stroke":       1,
    "tick-length":  3,
    "colour":       "#d09090",
    "grid-colour":  "#00ff00",
    "offset":       true,
    "min":         -4,
    "max":          4,
    "visible":      true,
    "steps":        1
  }

}
;
var y_axis_offset_tiny_numbers=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.8,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [2.1,2.2]
    }
  ],

  "y_axis":{
    "stroke":       4,
    "tick-length":  10,
    "colour":       "#000000",
    "grid-colour":  "#d0d0d0",
    "offset":       true,
    "min":          2,
    "max":          3,
    "visible":      true,
    "steps":        0.1
  }

}
;
var y_axis_right_all_bars=
﻿{
  "title":{
    "text":  "Many data lines",
    "style": "{font-size: 20px; color:#0000ff; font-family: Verdana; text-align: center;}"
  },

  "elements":[
    {
      "type":      "bar",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_sketch",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_glass",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_3d",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_filled",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_cylinder",
      "colour":    "#9933CC",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_cylinder_outline",
      "colour":    "#3030FF",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_round_glass",
      "colour":    "#CC0000",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_round",
      "colour":    "#CC0000",
      "values" :   [7,0,-7],
      "axis":      "right"
    },
    {
      "type":      "bar_dome",
      "colour":    "#CCCC00",
      "values" :   [7,0,-7],
      "axis":      "right"
    }
  ],

  "y_axis":{
    "tick-length": 3,
    "colour":      "#d000d0",
    "grid-visible":  false,
    "offset":      0,
    "min":         -10,
    "max":         10
  },

  "y_axis_right":{    
    "tick-length":   6,
    "colour":        "#d0d0d0",
    "of--fset":      0,
    "min":           -17,
    "max":           17,
    "grid-visible":  true,
    "grid-colour":   "#D0D0FF"
  }
}

;
var y_axis_right_all_lines_10_20=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":       "line",
      "colour":     "#CC3399",
      "values" :    [12,12],
      "axis":       "right"
    },
{
      "type":      "line",
      "colour":     "#736AFF",
      "line-style": {"style":"dash","on":10,"off":5},
      "values" :    [13,13],
      "axis":       "right"
    },
    {
      "type":      "line",
      "values" :   [14,14] ,
      "axis":      "right"
    }
  ],

  "y_axis":{
	"min":			10,
    "max":           20,
    "grid-visible":  true,
    "grid-colour":   "#FFD0D0"
  },

  "y_axis_right":{    
    "min":			10,
    "max":           20,
    "grid-visible":  true,
    "grid-colour":   "#D0D0FF"
  }

}
;
var y_axis_right_all_lines=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":       "line",
      "colour":     "#CC3399",
      "values" :    [2,2],
      "axis":       "right"
    },
{
      "type":      "line",
      "colour":     "#736AFF",
      "line-style": {"style":"dash","on":10,"off":5},
      "values" :    [3,3],
      "axis":       "right"
    },
    {
      "type":      "line",
      "values" :   [4,4] ,
      "axis":      "right"
    }
  ],

  "y_axis":{
    "max":           4,
    "grid-visible":  true,
    "grid-colour":   "#FFD0D0"
  },

  "y_axis_right":{    
    "max":           5,
    "grid-visible":  true,
    "grid-colour":   "#D0D0FF"
  }

}
;
var y_axis_right=
{
  "title":{
    "text":"Right Y Axis",
    "style":"{font-size: 30px;}"
  },

  "elements":[
    {
      "type":      "line",
      "colour":    "#CC3399",
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77]
    },
    {
      "type":      "line",
      "colour":    "#343399",
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77],
      "axis":      "right"
    }
  ],

  "y_axis":{
    "max":          2,
    "grid-visible":  true,
    "grid-colour":  "#CC3399",
	"colour":		"#CC3399"
  },

  "y_axis_right":{    
    "max":           3,
    "grid-visible":  true,
    "grid-colour":  "#0000FF",
	"colour":		"#0000FF"
  }
}
;
var y_axis_rotate_labels=
{
  
  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],

  "x_axis":{
    "max":30,
    "labels":{
      "labels":["0.00","0.38","0.74","1.07","1.36","1.60","1.77","1.87","1.90","1.85","1.73","1.54",
                "1.28","0.98","0.64","0.27","-0.11","-0.49","-0.84","-1.16","-1.44","-1.66","-1.81",
                "-1.89","-1.89","-1.82","-1.68","-1.47","-1.20","-0.88"]
    }
  },

  "y_axis":{
    "stroke":       1,
    "tick-length":  3,
    "colour":       "#d09090",
    "grid-colour":  "#00ff00",
    "offset":       1,
    "min":         -4,
    "max":          4,
    "visible":      true,
    "steps":        1,
    "rotate":       "vertical"
  }

}
;
var y_axis_upside_down_offset=
{
  "elements": [
    { "type": "line",
      "width": 2,
      "colour": "#195215",
      "values": [
        4, 7, 6, 7, 7, 19, 23, 19, 17, 14, 15, 12, 13, 17, 17, 10 ]
},

 {
      "type": "line",
      "width": 2,
      "colour": "#8523171",
      "values": [ 8, 5, 3, 4, 3, 10, 6, 4, 4, 5, 4, 3, 10, 9, 3, 8 ] },

    {
      "type": "line",
      "width": 2,
      "colour": "#8639811",
      "values": [
        9, 9, 18, 17, 17, 15, 12, 11, 8, 11, 11, 10, 8, 6, 5, 9 ] },
    {
      "type": "line",
      "width": 2,
      "colour": "#1972900",
      "values": [ null, null, 21, 14, 12, 7, 4, 3, 2, 2, 8, 18, 15, 12, 14, 10 ] }

 ],

 "title": { "text": "Three lines example" },
 "y_axis": { "min": 25, "max": 0, "steps": 5, "offset": true },

 "bg_colour": "#FFFFFF" }
;
var y_axis_upside_down=
{
  "elements": [
    { "type": "line",
      "width": 2,
      "colour": "#195215",
      "values": [
        4, 7, 6, 7, 7, 19, 23, 19, 17, 14, 15, 12, 13, 17, 17, 10 ]
},

 {
      "type": "line",
      "width": 2,
      "colour": "#8523171",
      "values": [ 8, 5, 3, 4, 3, 10, 6, 4, 4, 5, 4, 3, 10, 9, 3, 8 ] },

    {
      "type": "line",
      "width": 2,
      "colour": "#8639811",
      "values": [
        9, 9, 18, 17, 17, 15, 12, 11, 8, 11, 11, 10, 8, 6, 5, 9 ] },
    {
      "type": "line_hollow",
      "width": 2,
      "colour": "#1972900",
      "values": [ null, null, 21, 14, 12, 7, 4, 3, 2, 2, 8, 18, 15, 12, 14, 10 ] }

 ],

 "title": { "text": "Three lines example" },
 "y_axis": { "min": 25, "max": 0, "steps": 5 },

 "bg_colour": "#FFFFFF" }
;
var y_axis=
{
  "title":{
    "text":"Area Chart",
    "style":"{font-size: 30px;}"
  },

  "y_legend":{
    "text":"OFC",
    "style":"{font-size: 12px; color:#736AFF;}"
  },

  "elements":[
    {
      "type":      "area",
      "colour":    "#CC3399",
      "fill":      "#343399",
      "fill-alpha": 0.5,
      "text":      "Page views",
      "width":     3,
      "font-size": 10,
      "dot-size":  7,
      "values" :   [0,0.37,0.73,1.07,1.36,1.59,1.77,1.87,1.89,1.85,1.72,1.53,1.28,0.97,0.63,0.26,-0.11,-0.48,-0.84,-1.16,-1.43,-1.65,-1.80,-1.88,-1.89,-1.82,-1.67,-1.46,-1.19,-0.88]
    }
  ],

  "y_axis":{
    "stroke":       4,
    "tick-length":  10,
    "colour":       "#d09090",
    "grid-colour":  "#00ff00",
    "offset":       false,
    "min":         -4,
    "max":          4,
    "visible":      true,
    "steps":        2
  }

}
;
var y_labels_auto_formatted=
{
  "title":{
    "text":"Y Labels - Autmatic with Formatting",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{ "steps": 5 },

  "y_axis":{
	  "steps": 0.5, "min" : 0, "max":3,
	  "rotate":"vertical",
	  "labels": {
		  "text":"left #val#", 
		  "colour":"#DD3030",
		  "size":12
		}
  },
  
  "y_axis_right":{
	  "steps": 1, "min" : 3, "max":0,
	  "rotate":"vertical",
	  "labels": {
		  "text":"right #val#", 
		  "colour":"#DD30DD",
		  "size":10
 }
  },
  
  "elements":[
    {
      "type":      "line_hollow",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
      "dot-size":  4,
      "halo-size": 1,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ]
}
;
var y_labels_auto_labelstyle=
{
  "title":{
    "text":"Y Labels - Automatic with Label Style",
    "style":"{font-size: 16px; margin-top: 0; margin-bottom: 0; padding-top: 0; padding-bottom: 0; }"
  },

  "x_axis":{ "steps": 5 },

  "y_label__label_style":"12,#669999",
  "y_axis":{ "steps": 0.5, "min" : 0, "max":3 },
  
  "y_label_2__label_style":"12,#DD3030",
  "y_axis_right":{ "steps": 1, "min" : 3, "max":0 },
  
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "text":      "Avg. wave height (cm)",
      "font-size": 10,
      "width":     2,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ],

  "tooltip":{
    "shadow":true,
    "stroke":2,
    "colour":"#404040",
    "background":"#000000",
    "title":"{font-size: 14px; color: #905050;}",
    "body":"{font-size: 10px; font-weight: bold; color: #9090ff;}"
  }
}
;
var y_labels_auto=
{
  "title":{
    "text":"Y Labels - Automatically Generated Labels"
  },

  "x_axis":{ "steps": 5 },

  "y_axis":{ "steps": 0.5, "min" : 0, "max":3 },
  
  "y_axis_right":{ "steps": 1, "min" : 3, "max":0 },
  
  "elements":[
    {
      "type":      "line",
      "colour":    "#736AFF",
      "width":     2,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    },
	
	{
      "type":      "line",
	  "axis":      "right",
      "colour":    "#909090",
      "width":     2,
	  "tip": "#x_label#<br>#val#",
      "values" :   [1.5,1.69,1.88,2.06,2.21,2.34,2.43,2.48,2.49,2.47,2.40,2.30,2.17,2.01,1.83,1.64,1.44,1.24,1.05,0.88,0.74,0.62,0.54,0.50,0.50,0.54,0.61,0.72,0.86,1.03,1.22,1.41,1.61,1.81,1.99,2.15,2.29,2.39,2.46,2.49,2.48,2.44,2.35,2.23,2.08]
    }
  ]
}
;
