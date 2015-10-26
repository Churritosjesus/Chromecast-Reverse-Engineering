.class final Layl;
.super Lbfd;
.source "PG"


# instance fields
.field private a:Landroid/net/Uri;

.field private b:Laym;

.field private g:Ljava/util/List;

.field private final h:Lblp;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Laym;)V
    .locals 3

    .prologue
    .line 66
    invoke-direct {p0}, Lbfd;-><init>()V

    .line 67
    iput-object p1, p0, Layl;->a:Landroid/net/Uri;

    .line 68
    iput-object p2, p0, Layl;->b:Laym;

    .line 69
    new-instance v0, Lblp;

    const-string v1, "GetDeviceDescriptorRequest"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Layl;->h:Lblp;

    .line 70
    return-void
.end method

.method private a(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x3

    const/4 v2, 0x2

    .line 133
    const-string v0, "root"

    invoke-interface {p1, v2, v4, v0}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 134
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-eq v0, v3, :cond_b

    .line 135
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 138
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 140
    const-string v1, "device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2149
    const-string v0, "device"

    invoke-interface {p1, v2, v4, v0}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 2150
    :cond_1
    :goto_1
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-eq v0, v3, :cond_0

    .line 2151
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 2154
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2155
    const-string v1, "friendlyName"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2156
    iget-object v0, p0, Layl;->b:Laym;

    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    .line 3081
    iput-object v1, v0, Laym;->c:Ljava/lang/String;

    goto :goto_1

    .line 2157
    :cond_2
    const-string v1, "modelName"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2158
    iget-object v0, p0, Layl;->b:Laym;

    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    .line 3095
    iput-object v1, v0, Laym;->d:Ljava/lang/String;

    goto :goto_1

    .line 2159
    :cond_3
    const-string v1, "UDN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2160
    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v0

    .line 2161
    const-string v1, "uuid:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 2163
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2165
    :cond_4
    iget-object v1, p0, Layl;->b:Laym;

    .line 4058
    iput-object v0, v1, Laym;->a:Ljava/lang/String;

    goto :goto_1

    .line 2166
    :cond_5
    const-string v1, "serviceList"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 4178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Layl;->g:Ljava/util/List;

    .line 4179
    const-string v0, "serviceList"

    invoke-interface {p1, v2, v4, v0}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 4180
    :cond_6
    :goto_2
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    if-eq v0, v3, :cond_1

    .line 4181
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v2, :cond_6

    .line 4184
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 4185
    const-string v1, "service"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4186
    invoke-direct {p0, p1}, Layl;->b(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_2

    .line 4188
    :cond_7
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_2

    .line 2168
    :cond_8
    const-string v1, "iconList"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2169
    invoke-direct {p0, p1}, Layl;->c(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_1

    .line 2171
    :cond_9
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_1

    .line 143
    :cond_a
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto/16 :goto_0

    .line 146
    :cond_b
    return-void
.end method

.method private b(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .prologue
    const/4 v2, 0x2

    .line 195
    const/4 v0, 0x0

    const-string v1, "service"

    invoke-interface {p1, v2, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    .line 197
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 200
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    .line 202
    const-string v1, "serviceType"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 203
    iget-object v0, p0, Layl;->g:Ljava/util/List;

    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 204
    :cond_1
    const-string v1, "SCPDURL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 205
    iget-object v0, p0, Layl;->b:Laym;

    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    goto :goto_0

    .line 207
    :cond_2
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 210
    :cond_3
    return-void
.end method

.method private c(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 214
    const/4 v0, 0x0

    const-string v1, "iconList"

    invoke-interface {p1, v3, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 215
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 216
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    .line 217
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 220
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    .line 221
    const-string v2, "icon"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 222
    invoke-direct {p0, p1}, Layl;->d(Lorg/xmlpull/v1/XmlPullParser;)Layo;

    move-result-object v1

    .line 223
    if-eqz v1, :cond_0

    .line 224
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 227
    :cond_1
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 230
    :cond_2
    iget-object v1, p0, Layl;->b:Laym;

    .line 6121
    iput-object v0, v1, Laym;->f:Ljava/util/ArrayList;

    .line 231
    return-void
.end method

.method private d(Lorg/xmlpull/v1/XmlPullParser;)Layo;
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 235
    .line 238
    const-string v1, "icon"

    invoke-interface {p1, v7, v4, v1}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    move v1, v0

    move v2, v0

    move-object v3, v4

    .line 239
    :cond_0
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_5

    .line 240
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v5

    if-ne v5, v7, :cond_0

    .line 243
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 244
    const-string v6, "width"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 245
    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 246
    :cond_1
    const-string v6, "height"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 247
    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_0

    .line 248
    :cond_2
    const-string v6, "depth"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 249
    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 250
    :cond_3
    const-string v6, "url"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 251
    invoke-static {p1}, La;->b(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 253
    :cond_4
    invoke-static {p1}, La;->a(Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_0

    .line 257
    :cond_5
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    if-lez v2, :cond_6

    if-lez v1, :cond_6

    if-gtz v0, :cond_7

    .line 268
    :cond_6
    :goto_1
    return-object v4

    .line 264
    :cond_7
    iget-object v0, p0, Layl;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 265
    invoke-virtual {v0, v3}, Ljava/net/URI;->resolve(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 268
    new-instance v4, Layo;

    invoke-direct {v4, v2, v1, v0}, Layo;-><init>(IILandroid/net/Uri;)V

    goto :goto_1
.end method


# virtual methods
.method public final a()I
    .locals 5

    .prologue
    const/4 v0, -0x1

    const/4 v1, -0x3

    .line 85
    :try_start_0
    iget-object v2, p0, Layl;->a:Landroid/net/Uri;

    sget v3, Layl;->c:I

    invoke-virtual {p0, v2, v3}, Layl;->a(Landroid/net/Uri;I)Lbfq;

    move-result-object v2

    .line 86
    invoke-interface {v2}, Lbfq;->b()I

    move-result v3

    const/16 v4, 0xc8

    if-eq v3, v4, :cond_0

    .line 128
    :goto_0
    return v0

    .line 89
    :cond_0
    invoke-interface {v2}, Lbfq;->c()Lbfc;

    move-result-object v3

    .line 90
    const-string v4, "application-url"

    invoke-interface {v2, v4}, Lbfq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 91
    if-nez v2, :cond_1

    move v0, v1

    .line 92
    goto :goto_0

    .line 94
    :cond_1
    iget-object v4, p0, Layl;->b:Laym;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 1106
    iput-object v2, v4, Laym;->e:Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1132
    iget-boolean v0, p0, Lbfd;->f:Z

    .line 103
    if-eqz v0, :cond_2

    .line 104
    const/16 v0, -0x63

    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    const/4 v0, -0x2

    goto :goto_0

    .line 108
    :cond_2
    if-eqz v3, :cond_3

    const-string v0, "application/xml"

    .line 2092
    iget-object v2, v3, Lbfc;->b:Ljava/lang/String;

    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    move v0, v1

    .line 109
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {v3}, Lbfc;->a()Ljava/lang/String;

    move-result-object v0

    .line 112
    if-nez v0, :cond_5

    move v0, v1

    .line 113
    goto :goto_0

    .line 116
    :cond_5
    :try_start_1
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v0

    .line 117
    new-instance v2, Ljava/io/StringReader;

    invoke-virtual {v3}, Lbfc;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 118
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->nextTag()I

    .line 119
    invoke-direct {p0, v0}, Layl;->a(Lorg/xmlpull/v1/XmlPullParser;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2

    .line 128
    const/4 v0, 0x0

    goto :goto_0

    .line 122
    :catch_1
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 125
    :catch_2
    move-exception v0

    move v0, v1

    goto :goto_0

    .line 98
    :catch_3
    move-exception v1

    goto :goto_0

    .line 96
    :catch_4
    move-exception v1

    goto :goto_0
.end method
