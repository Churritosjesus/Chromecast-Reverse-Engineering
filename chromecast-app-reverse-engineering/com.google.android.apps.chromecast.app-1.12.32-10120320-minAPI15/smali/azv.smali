.class public final Lazv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/content/Context;

.field final b:Landroid/os/Handler;

.field public final c:Landroid/net/wifi/WifiManager;

.field final d:Landroid/net/ConnectivityManager;

.field final e:J

.field f:Lbab;

.field g:Ljava/lang/String;

.field public h:J

.field public i:J

.field public j:Ljava/lang/String;

.field final k:Lblp;

.field private l:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Lblp;

    const-string v1, "WifiConnectionManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lazv;->k:Lblp;

    .line 78
    iput-object p1, p0, Lazv;->a:Landroid/content/Context;

    .line 79
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lazv;->b:Landroid/os/Handler;

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->fk:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lazv;->e:J

    .line 82
    iget-object v0, p0, Lazv;->a:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    .line 83
    const-string v0, "connectivity"

    .line 84
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lazv;->d:Landroid/net/ConnectivityManager;

    .line 85
    iget-object v0, p0, Lazv;->a:Landroid/content/Context;

    invoke-static {v0}, Lblf;->Y(Landroid/content/Context;)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lazv;->h:J

    .line 86
    return-void
.end method

.method static synthetic a(Lazv;Landroid/net/Network;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 36
    .line 10742
    invoke-static {p1}, Landroid/net/ConnectivityManager;->setProcessDefaultNetwork(Landroid/net/Network;)Z

    move-result v0

    .line 10743
    if-eqz v0, :cond_0

    .line 10744
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    .line 10745
    iput-object p2, p0, Lazv;->g:Ljava/lang/String;

    :goto_0
    return-void

    .line 10747
    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    goto :goto_0
.end method

.method static a(Lbaa;)V
    .locals 0

    .prologue
    .line 609
    if-eqz p0, :cond_0

    .line 610
    invoke-interface {p0}, Lbaa;->a()V

    .line 612
    :cond_0
    return-void
.end method

.method static a(Lbaa;Z)V
    .locals 0

    .prologue
    .line 615
    if-eqz p0, :cond_0

    .line 616
    invoke-interface {p0, p1}, Lbaa;->a(Z)V

    .line 618
    :cond_0
    return-void
.end method

.method static a(Ljava/lang/String;Landroid/net/wifi/WifiInfo;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 668
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 674
    :cond_0
    :goto_0
    return v0

    .line 671
    :cond_1
    invoke-static {p1}, Lblr;->a(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 674
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    const/16 v2, 0x22

    .line 678
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 679
    const-string p0, ""

    .line 685
    :cond_0
    :goto_0
    return-object p0

    .line 681
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 682
    if-lez v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v0, v2, :cond_0

    .line 685
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0
.end method

.method static c()Z
    .locals 2

    .prologue
    .line 699
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 636
    iget-object v1, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v3

    .line 637
    if-nez v3, :cond_0

    .line 648
    :goto_0
    return v0

    .line 10621
    :cond_0
    new-instance v1, Lazx;

    invoke-direct {v1}, Lazx;-><init>()V

    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 641
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v2, v0

    .line 642
    :goto_1
    if-ge v2, v1, :cond_1

    .line 643
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiConfiguration;

    .line 644
    iput v2, v0, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 645
    iget-object v4, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v4, v0}, Landroid/net/wifi/WifiManager;->updateNetwork(Landroid/net/wifi/WifiConfiguration;)I

    .line 642
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 647
    :cond_1
    iget-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    move v0, v1

    .line 648
    goto :goto_0
.end method

.method private f()I
    .locals 4

    .prologue
    .line 652
    const/4 v0, 0x0

    .line 653
    iget-object v1, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v1

    .line 654
    if-eqz v1, :cond_0

    .line 655
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiConfiguration;

    .line 656
    iget v3, v0, Landroid/net/wifi/WifiConfiguration;->priority:I

    if-le v3, v1, :cond_2

    .line 657
    iget v0, v0, Landroid/net/wifi/WifiConfiguration;->priority:I

    :goto_1
    move v1, v0

    .line 659
    goto :goto_0

    :cond_0
    move v1, v0

    .line 661
    :cond_1
    return v1

    :cond_2
    move v0, v1

    goto :goto_1
.end method


# virtual methods
.method public final a(Lbfs;)Landroid/net/wifi/WifiConfiguration;
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/4 v8, 0x2

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 305
    .line 2332
    sget-object v0, Lazz;->a:[I

    .line 3138
    iget-object v4, p1, Lbfs;->b:Lbfu;

    .line 2332
    invoke-virtual {v4}, Lbfu;->ordinal()I

    move-result v4

    aget v0, v0, v4

    packed-switch v0, :pswitch_data_0

    .line 2339
    iget-object v0, p0, Lazv;->k:Lblp;

    const-string v4, "authType %s not supported"

    new-array v5, v3, [Ljava/lang/Object;

    .line 4138
    iget-object v6, p1, Lbfs;->b:Lbfu;

    .line 2339
    aput-object v6, v5, v1

    invoke-virtual {v0, v4, v5}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    move v0, v1

    .line 305
    :goto_0
    if-nez v0, :cond_1

    move-object v0, v2

    .line 328
    :cond_0
    :goto_1
    return-object v0

    :pswitch_0
    move v0, v3

    .line 2337
    goto :goto_0

    .line 5130
    :cond_1
    iget-object v0, p1, Lbfs;->a:Ljava/lang/String;

    .line 308
    invoke-virtual {p0, v0}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v0

    .line 309
    if-nez v0, :cond_0

    .line 314
    new-instance v4, Landroid/net/wifi/WifiConfiguration;

    invoke-direct {v4}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    .line 6130
    iget-object v0, p1, Lbfs;->a:Ljava/lang/String;

    .line 315
    invoke-static {v0}, Lazv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    .line 6195
    iget-object v0, p1, Lbfs;->i:Ljava/lang/String;

    .line 316
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 7195
    iget-object v0, p1, Lbfs;->i:Ljava/lang/String;

    .line 317
    iput-object v0, v4, Landroid/net/wifi/WifiConfiguration;->BSSID:Ljava/lang/String;

    .line 8162
    :cond_2
    iget-object v5, p1, Lbfs;->e:Ljava/lang/String;

    .line 7351
    if-nez v5, :cond_5

    move v0, v1

    .line 7352
    :goto_2
    sget-object v6, Lazz;->a:[I

    .line 9138
    iget-object v7, p1, Lbfs;->b:Lbfu;

    .line 7352
    invoke-virtual {v7}, Lbfu;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_1

    .line 9178
    :cond_3
    :goto_3
    iget-boolean v0, p1, Lbfs;->g:Z

    .line 321
    iput-boolean v0, v4, Landroid/net/wifi/WifiConfiguration;->hiddenSSID:Z

    .line 322
    iget-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v4}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v0

    .line 323
    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    move-result v0

    if-nez v0, :cond_9

    :cond_4
    move-object v0, v2

    .line 324
    goto :goto_1

    .line 7351
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_2

    .line 7354
    :pswitch_1
    iget-object v0, v4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_3

    .line 7357
    :pswitch_2
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7358
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7359
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7360
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7361
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedAuthAlgorithms:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7362
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    .line 7363
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7364
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7365
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7366
    if-eqz v5, :cond_3

    if-lez v0, :cond_3

    .line 7368
    const/16 v3, 0xa

    if-eq v0, v3, :cond_6

    const/16 v3, 0x1a

    if-eq v0, v3, :cond_6

    const/16 v3, 0x3a

    if-ne v0, v3, :cond_7

    :cond_6
    const-string v0, "[0-9A-Fa-f]*"

    .line 7369
    invoke-virtual {v5, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 7370
    iget-object v0, v4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    aput-object v5, v0, v1

    .line 7374
    :goto_4
    iput v1, v4, Landroid/net/wifi/WifiConfiguration;->wepTxKeyIndex:I

    goto :goto_3

    .line 7372
    :cond_7
    iget-object v0, v4, Landroid/net/wifi/WifiConfiguration;->wepKeys:[Ljava/lang/String;

    invoke-static {v5}, Lazv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    goto :goto_4

    .line 7379
    :pswitch_3
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedKeyManagement:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7380
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7381
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedProtocols:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7382
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v3}, Ljava/util/BitSet;->set(I)V

    .line 7383
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedPairwiseCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v8}, Ljava/util/BitSet;->set(I)V

    .line 7384
    iget-object v6, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v6, v1}, Ljava/util/BitSet;->set(I)V

    .line 7385
    iget-object v1, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v1, v3}, Ljava/util/BitSet;->set(I)V

    .line 7386
    iget-object v1, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    invoke-virtual {v1, v8}, Ljava/util/BitSet;->set(I)V

    .line 7387
    iget-object v1, v4, Landroid/net/wifi/WifiConfiguration;->allowedGroupCiphers:Ljava/util/BitSet;

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Ljava/util/BitSet;->set(I)V

    .line 7388
    if-eqz v5, :cond_3

    if-lez v0, :cond_3

    .line 7389
    const-string v0, "[0-9A-Fa-f]{64}"

    invoke-virtual {v5, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 7390
    iput-object v5, v4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    goto/16 :goto_3

    .line 7392
    :cond_8
    invoke-static {v5}, Lazv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    goto/16 :goto_3

    .line 10130
    :cond_9
    iget-object v0, p1, Lbfs;->a:Ljava/lang/String;

    .line 328
    invoke-virtual {p0, v0}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v0

    goto/16 :goto_1

    .line 2332
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 7352
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 283
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 295
    :goto_0
    return-object v0

    .line 286
    :cond_0
    invoke-static {p1}, Lazv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 287
    iget-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v0

    .line 288
    if-eqz v0, :cond_2

    .line 289
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiConfiguration;

    .line 290
    iget-object v4, v0, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    invoke-static {v2, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 295
    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 212
    iget-object v0, p0, Lazv;->f:Lbab;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lazv;->f:Lbab;

    invoke-virtual {v0}, Lbab;->a()V

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lazv;->f:Lbab;

    .line 216
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Lbaa;Z)Z
    .locals 7

    .prologue
    const/4 v6, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 167
    new-array v0, v3, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 168
    invoke-virtual {p0}, Lazv;->a()V

    .line 1100
    invoke-virtual {p0, p1, v3}, Lazv;->a(Ljava/lang/String;Z)Z

    move-result v0

    .line 169
    if-eqz v0, :cond_0

    .line 170
    invoke-static {p2}, Lazv;->a(Lbaa;)V

    move v0, v2

    .line 205
    :goto_0
    return v0

    .line 173
    :cond_0
    invoke-virtual {p0}, Lazv;->b()V

    .line 174
    invoke-virtual {p0, p1}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v1

    .line 175
    if-nez v1, :cond_1

    .line 177
    invoke-static {p2, v2}, Lazv;->a(Lbaa;Z)V

    move v0, v2

    .line 178
    goto :goto_0

    .line 181
    :cond_1
    new-instance v0, Lbab;

    new-instance v4, Lazw;

    invoke-direct {v4, p0, p2}, Lazw;-><init>(Lazv;Lbaa;)V

    invoke-direct {v0, p0, p1, p3, v4}, Lbab;-><init>(Lazv;Ljava/lang/String;ZLbaa;)V

    iput-object v0, p0, Lazv;->f:Lbab;

    .line 195
    if-eqz p3, :cond_2

    invoke-static {}, Lazv;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1707
    new-instance v0, Lazy;

    invoke-direct {v0, p0, p1}, Lazy;-><init>(Lazv;Ljava/lang/String;)V

    iput-object v0, p0, Lazv;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 1735
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 1736
    invoke-virtual {v0, v3}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    .line 1737
    iget-object v4, p0, Lazv;->d:Landroid/net/ConnectivityManager;

    iget-object v5, p0, Lazv;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v4, v0, v5}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 2239
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x16

    if-ge v0, v4, :cond_9

    .line 2240
    new-array v0, v3, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 2241
    iget v0, v1, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 2242
    invoke-direct {p0}, Lazv;->f()I

    move-result v4

    .line 2243
    const v5, 0x186a0

    if-lt v4, v5, :cond_4

    .line 2246
    invoke-direct {p0}, Lazv;->e()I

    move-result v4

    .line 2247
    invoke-virtual {p0, p1}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v1

    .line 2248
    if-nez v1, :cond_3

    move v0, v2

    .line 199
    :goto_1
    if-nez v0, :cond_a

    .line 201
    invoke-virtual {p0}, Lazv;->a()V

    .line 202
    invoke-static {p2, v2}, Lazv;->a(Lbaa;Z)V

    move v0, v2

    .line 203
    goto :goto_0

    .line 2251
    :cond_3
    iget v0, v1, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 2252
    iput v4, v1, Landroid/net/wifi/WifiConfiguration;->priority:I

    .line 2256
    :goto_2
    iget-object v4, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v4, v1}, Landroid/net/wifi/WifiManager;->updateNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v4

    .line 2257
    if-ne v4, v6, :cond_5

    move v0, v2

    .line 2258
    goto :goto_1

    .line 2254
    :cond_4
    add-int/lit8 v4, v4, 0x1

    iput v4, v1, Landroid/net/wifi/WifiConfiguration;->priority:I

    goto :goto_2

    .line 2262
    :cond_5
    iget-object v5, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v5, v4, v2}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    .line 2263
    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    move-result v4

    if-nez v4, :cond_8

    .line 2264
    :cond_6
    if-eq v0, v6, :cond_7

    .line 2265
    iput v0, v1, Landroid/net/wifi/WifiConfiguration;->priority:I

    :cond_7
    move v0, v2

    .line 2267
    goto :goto_1

    .line 2271
    :cond_8
    invoke-virtual {p0, p1}, Lazv;->a(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v1

    .line 2272
    if-nez v1, :cond_9

    move v0, v2

    .line 2273
    goto :goto_1

    .line 2278
    :cond_9
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v4, v1, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    aput-object v4, v0, v2

    iget v4, v1, Landroid/net/wifi/WifiConfiguration;->networkId:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v3

    .line 2279
    iget-object v0, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    iget v1, v1, Landroid/net/wifi/WifiConfiguration;->networkId:I

    invoke-virtual {v0, v1, v3}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    move-result v0

    goto :goto_1

    :cond_a
    move v0, v3

    .line 205
    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;Z)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v0, 0x1

    .line 107
    iget-object v1, p0, Lazv;->g:Ljava/lang/String;

    invoke-static {p1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 108
    if-eqz p2, :cond_0

    .line 109
    new-array v1, v0, [Ljava/lang/Object;

    aput-object p1, v1, v2

    .line 132
    :cond_0
    :goto_0
    return v0

    .line 113
    :cond_1
    iget-object v1, p0, Lazv;->d:Landroid/net/ConnectivityManager;

    .line 114
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v1

    .line 115
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-nez v3, :cond_4

    .line 116
    :cond_2
    if-eqz p2, :cond_3

    .line 117
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    :cond_3
    move v0, v2

    .line 119
    goto :goto_0

    .line 122
    :cond_4
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 125
    iget-object v1, p0, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v1

    invoke-static {p1, v1}, Lazv;->a(Ljava/lang/String;Landroid/net/wifi/WifiInfo;)Z

    move-result v1

    .line 129
    :goto_1
    if-eqz p2, :cond_5

    .line 130
    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v0

    :cond_5
    move v0, v1

    .line 132
    goto :goto_0

    .line 127
    :cond_6
    invoke-static {p1, v1}, Lblr;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto :goto_1
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 689
    invoke-static {}, Lazv;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 696
    :cond_0
    :goto_0
    return-void

    .line 692
    :cond_1
    iget-object v0, p0, Lazv;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 695
    invoke-virtual {p0}, Lazv;->d()V

    goto :goto_0
.end method

.method d()V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 753
    invoke-static {v2}, Landroid/net/ConnectivityManager;->setProcessDefaultNetwork(Landroid/net/Network;)Z

    move-result v0

    .line 754
    if-eqz v0, :cond_1

    .line 755
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lazv;->g:Ljava/lang/String;

    aput-object v1, v0, v3

    .line 756
    iput-object v2, p0, Lazv;->g:Ljava/lang/String;

    .line 757
    iget-object v0, p0, Lazv;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz v0, :cond_0

    .line 758
    iget-object v0, p0, Lazv;->d:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lazv;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 759
    iput-object v2, p0, Lazv;->l:Landroid/net/ConnectivityManager$NetworkCallback;

    .line 764
    :cond_0
    :goto_0
    return-void

    .line 762
    :cond_1
    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lazv;->g:Ljava/lang/String;

    aput-object v1, v0, v3

    goto :goto_0
.end method
