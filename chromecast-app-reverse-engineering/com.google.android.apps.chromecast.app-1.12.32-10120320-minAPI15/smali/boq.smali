.class public final Lboq;
.super Landroid/widget/ArrayAdapter;
.source "PG"


# instance fields
.field private final a:Lblp;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 27
    sget v0, La;->gV:I

    invoke-direct {p0, p1, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 28
    new-instance v0, Lblp;

    const-string v1, "WifiNetworkAdapter"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lboq;->a:Lblp;

    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 113
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lboq;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 114
    invoke-virtual {p0, v1}, Lboq;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 7130
    iget-object v0, v0, Lbfs;->a:Ljava/lang/String;

    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    :goto_1
    return v1

    .line 113
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 119
    :cond_1
    const/4 v1, -0x1

    goto :goto_1
.end method

.method public final getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    .line 33
    invoke-virtual {p0, p1, p2, p3}, Lboq;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->dJ:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 36
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    return-object v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v3, 0x0

    .line 42
    .line 43
    if-nez p2, :cond_0

    .line 44
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 46
    sget v1, La;->gV:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 48
    :cond_0
    invoke-virtual {p0, p1}, Lboq;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 49
    sget v1, Lf;->dY:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1130
    iget-object v2, v0, Lbfs;->a:Ljava/lang/String;

    .line 50
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    sget v1, Lf;->u:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1138
    iget-object v2, v0, Lbfs;->b:Lbfu;

    .line 2061
    sget-object v4, Lbor;->a:[I

    invoke-virtual {v2}, Lbfu;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    .line 2072
    iget-object v4, p0, Lboq;->a:Lblp;

    const-string v5, "WpaAuthType mapping missing for %s"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v2}, Lbfu;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v6, v3

    invoke-virtual {v4, v5, v6}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2073
    sget v2, Lb;->es:I

    .line 52
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 53
    sget v1, Lf;->dP:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 2187
    iget v2, v0, Lbfs;->h:I

    .line 2078
    if-eqz v2, :cond_1

    .line 3187
    iget v2, v0, Lbfs;->h:I

    .line 2083
    invoke-static {v2, v7}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v2

    .line 4138
    iget-object v4, v0, Lbfs;->b:Lbfu;

    .line 2084
    iget-boolean v4, v4, Lbfu;->k:Z

    .line 2085
    packed-switch v2, :pswitch_data_1

    :cond_1
    move v2, v3

    .line 54
    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5187
    iget v2, v0, Lbfs;->h:I

    .line 5098
    if-eqz v2, :cond_2

    .line 6187
    iget v0, v0, Lbfs;->h:I

    .line 5101
    invoke-static {v0, v7}, Landroid/net/wifi/WifiManager;->calculateSignalLevel(II)I

    move-result v0

    .line 5102
    packed-switch v0, :pswitch_data_2

    .line 5107
    :cond_2
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lb;->ej:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 55
    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 57
    return-object p2

    .line 2062
    :pswitch_0
    sget v2, Lb;->es:I

    goto :goto_0

    .line 2063
    :pswitch_1
    sget v2, Lb;->ep:I

    goto :goto_0

    .line 2064
    :pswitch_2
    sget v2, Lb;->eq:I

    goto :goto_0

    .line 2065
    :pswitch_3
    sget v2, Lb;->er:I

    goto :goto_0

    .line 2066
    :pswitch_4
    sget v2, Lb;->eo:I

    goto :goto_0

    .line 2067
    :pswitch_5
    sget v2, Lb;->ew:I

    goto :goto_0

    .line 2068
    :pswitch_6
    sget v2, Lb;->ev:I

    goto :goto_0

    .line 2069
    :pswitch_7
    sget v2, Lb;->eu:I

    goto :goto_0

    .line 2070
    :pswitch_8
    sget v2, Lb;->et:I

    goto :goto_0

    .line 2086
    :pswitch_9
    if-eqz v4, :cond_3

    sget v2, La;->eQ:I

    goto :goto_1

    :cond_3
    sget v2, La;->eU:I

    goto :goto_1

    .line 2087
    :pswitch_a
    if-eqz v4, :cond_4

    sget v2, La;->eP:I

    goto :goto_1

    :cond_4
    sget v2, La;->eT:I

    goto :goto_1

    .line 2088
    :pswitch_b
    if-eqz v4, :cond_5

    sget v2, La;->eO:I

    goto :goto_1

    :cond_5
    sget v2, La;->eS:I

    goto :goto_1

    .line 2089
    :pswitch_c
    if-eqz v4, :cond_6

    sget v2, La;->eN:I

    goto :goto_1

    :cond_6
    sget v2, La;->eR:I

    goto :goto_1

    .line 5103
    :pswitch_d
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lb;->ei:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 5104
    :pswitch_e
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lb;->eh:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 5105
    :pswitch_f
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lb;->eg:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 5106
    :pswitch_10
    invoke-virtual {p0}, Lboq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lb;->ef:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 2061
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch

    .line 2085
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    .line 5102
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method
