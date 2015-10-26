.class final Lazm;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final b:Ljava/util/Locale;


# instance fields
.field a:Lazr;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;

.field private e:Ljava/net/InetSocketAddress;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:Landroid/os/Handler;

.field private volatile j:Z

.field private k:Ljava/util/List;

.field private l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private m:Landroid/net/ConnectivityManager;

.field private n:Lazq;

.field private o:Landroid/net/wifi/WifiManager;

.field private p:Ljava/lang/String;

.field private q:Lazt;

.field private volatile r:Z

.field private final s:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 64
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    sput-object v0, Lazm;->b:Ljava/util/Locale;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IILandroid/os/Handler;)V
    .locals 3

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    new-instance v0, Lblp;

    const-string v1, "SsdpScanner"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lazm;->s:Lblp;

    .line 117
    if-gtz p3, :cond_0

    .line 118
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "delay must be at least 1 second"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_0
    iput-object p1, p0, Lazm;->c:Landroid/content/Context;

    .line 121
    iput-object p2, p0, Lazm;->f:Ljava/lang/String;

    .line 122
    iput p4, p0, Lazm;->h:I

    .line 123
    iput p3, p0, Lazm;->g:I

    .line 124
    iput-object p5, p0, Lazm;->i:Landroid/os/Handler;

    .line 125
    new-instance v0, Ljava/net/InetSocketAddress;

    const-string v1, "239.255.255.250"

    const/16 v2, 0x76c

    invoke-direct {v0, v1, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lazm;->e:Ljava/net/InetSocketAddress;

    .line 126
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lazm;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lazm;->d:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lazm;->k:Ljava/util/List;

    .line 130
    iget-object v0, p0, Lazm;->c:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    iput-object v0, p0, Lazm;->m:Landroid/net/ConnectivityManager;

    .line 133
    iget-object v0, p0, Lazm;->c:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lazm;->c:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lazm;->o:Landroid/net/wifi/WifiManager;

    .line 139
    :cond_1
    return-void
.end method

.method static synthetic a(Lazm;Lazt;)Lazt;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lazm;->q:Lazt;

    return-object v0
.end method

.method static synthetic a(Lazm;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lazm;->p:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lazm;)V
    .locals 6

    .prologue
    .line 48
    .line 2342
    sget-object v0, Lazm;->b:Ljava/util/Locale;

    const-string v1, "M-SEARCH * HTTP/1.1\r\nHOST: %s:%d\r\nMAN: \"ssdp:discover\"\r\nMX: %d\r\nST: %s\r\n\r\n"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "239.255.255.250"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const/16 v4, 0x76c

    .line 2344
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget v4, p0, Lazm;->g:I

    .line 2345
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lazm;->f:Ljava/lang/String;

    aput-object v4, v2, v3

    .line 2342
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 2348
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 2351
    :try_start_0
    new-instance v1, Ljava/net/DatagramPacket;

    array-length v2, v0

    iget-object v3, p0, Lazm;->e:Ljava/net/InetSocketAddress;

    invoke-direct {v1, v0, v2, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    .line 2352
    :cond_0
    iget-boolean v0, p0, Lazm;->j:Z

    if-nez v0, :cond_1

    .line 2353
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/MulticastSocket;

    .line 2354
    invoke-virtual {v0, v1}, Ljava/net/MulticastSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 2356
    :try_start_1
    iget v0, p0, Lazm;->h:I

    int-to-long v4, v0

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 2358
    :catch_0
    move-exception v0

    :try_start_2
    iget-boolean v0, p0, Lazm;->j:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 2365
    :catch_1
    move-exception v0

    iget-boolean v0, p0, Lazm;->j:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Send thread got an exception; mShouldStop="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 2366
    iget-boolean v0, p0, Lazm;->j:Z

    if-nez v0, :cond_1

    .line 2367
    invoke-direct {p0}, Lazm;->d()V

    .line 2369
    :cond_1
    return-void
.end method

.method static synthetic a(Lazm;Ljava/net/MulticastSocket;)V
    .locals 7

    .prologue
    const/16 v2, 0x1000

    .line 48
    .line 3373
    new-array v0, v2, [B

    .line 3374
    new-instance v1, Ljava/net/DatagramPacket;

    invoke-direct {v1, v0, v2}, Ljava/net/DatagramPacket;-><init>([BI)V

    .line 3377
    :cond_0
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lazm;->j:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    .line 3379
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/net/MulticastSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 3383
    :try_start_2
    iget-boolean v0, p0, Lazm;->j:Z

    if-nez v0, :cond_2

    .line 3387
    new-instance v2, Lazu;

    invoke-direct {v2}, Lazu;-><init>()V

    .line 3389
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v3

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getOffset()I

    move-result v4

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v5

    const-string v6, "UTF8"

    invoke-direct {v0, v3, v4, v5, v6}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    .line 3391
    new-instance v3, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/StringReader;

    invoke-direct {v4, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 3393
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 3394
    sget-object v4, Lazm;->b:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 3395
    const-string v5, "CACHE-CONTROL:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 3396
    const/16 v4, 0xe

    .line 3397
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    .line 3428
    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lazm;->j:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x32

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Receive thread got an exception; mShouldStop="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 3429
    iget-boolean v0, p0, Lazm;->j:Z

    if-nez v0, :cond_2

    .line 3430
    invoke-direct {p0}, Lazm;->d()V

    .line 3432
    :cond_2
    return-void

    .line 3398
    :cond_3
    :try_start_3
    const-string v5, "DATE:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 3399
    const/4 v4, 0x5

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    goto :goto_1

    .line 3400
    :cond_4
    const-string v5, "LOCATION:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 3401
    const/16 v4, 0x9

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 3506
    iput-object v0, v2, Lazu;->a:Ljava/lang/String;

    goto :goto_1

    .line 3402
    :cond_5
    const-string v5, "SERVER:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 3403
    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    goto :goto_1

    .line 3404
    :cond_6
    const-string v5, "ST:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 3405
    const/4 v4, 0x3

    .line 3406
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    goto :goto_1

    .line 3407
    :cond_7
    const-string v5, "USN:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 3408
    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 4530
    iput-object v0, v2, Lazu;->b:Ljava/lang/String;

    goto/16 :goto_1

    .line 3409
    :cond_8
    const-string v5, "BOOTID.UPNP.ORG:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 3410
    const/16 v4, 0x10

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    goto/16 :goto_1

    .line 3415
    :cond_9
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 4549
    iget-object v0, v2, Lazu;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, v2, Lazu;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    .line 3417
    :goto_2
    if-eqz v0, :cond_0

    iget-object v0, p0, Lazm;->a:Lazr;

    if-eqz v0, :cond_0

    .line 3418
    iget-object v0, p0, Lazm;->i:Landroid/os/Handler;

    new-instance v3, Lazo;

    invoke-direct {v3, p0, v2}, Lazo;-><init>(Lazm;Lazu;)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    .line 4549
    :cond_a
    const/4 v0, 0x0

    goto :goto_2

    .line 3381
    :catch_1
    move-exception v0

    goto/16 :goto_0
.end method

.method static synthetic a(Lazm;Ljava/util/List;)V
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 48
    .line 3165
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3167
    :cond_0
    invoke-direct {p0}, Lazm;->e()V

    .line 3181
    :cond_1
    :goto_0
    return-void

    .line 3172
    :cond_2
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/NetworkInterface;

    .line 3173
    new-instance v5, Ljava/net/MulticastSocket;

    invoke-direct {v5}, Ljava/net/MulticastSocket;-><init>()V

    .line 3174
    invoke-virtual {v5, v0}, Ljava/net/MulticastSocket;->setNetworkInterface(Ljava/net/NetworkInterface;)V

    .line 3175
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/net/MulticastSocket;->setTimeToLive(I)V

    .line 3176
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 3178
    :catch_0
    move-exception v0

    .line 3179
    :try_start_1
    iget-object v1, p0, Lazm;->s:Lblp;

    const-string v2, "couldn\'t create socket"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v4}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3180
    invoke-direct {p0}, Lazm;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3183
    iput-object v3, p0, Lazm;->q:Lazt;

    goto :goto_0

    :cond_3
    iput-object v3, p0, Lazm;->q:Lazt;

    .line 3186
    iput-boolean v4, p0, Lazm;->r:Z

    .line 3187
    iput-boolean v4, p0, Lazm;->j:Z

    .line 3188
    iget-object v0, p0, Lazm;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 3190
    new-instance v0, Lazn;

    invoke-direct {v0, p0}, Lazn;-><init>(Lazm;)V

    .line 3196
    const-string v1, "SsdpScanner send thread"

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 3197
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3198
    iget-object v1, p0, Lazm;->k:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3201
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 3202
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/MulticastSocket;

    .line 3203
    new-instance v7, Ljava/lang/Thread;

    new-instance v8, Lazs;

    invoke-direct {v8, p0, v0}, Lazs;-><init>(Lazm;Ljava/net/MulticastSocket;)V

    invoke-direct {v7, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3204
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v8, 0x36

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "SsdpScanner receive thread #"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, " of "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 3205
    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    .line 3206
    iget-object v0, p0, Lazm;->k:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3207
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 3208
    goto :goto_2

    .line 3183
    :catchall_0
    move-exception v0

    iput-object v3, p0, Lazm;->q:Lazt;

    throw v0

    .line 3211
    :cond_4
    iget-object v0, p0, Lazm;->o:Landroid/net/wifi/WifiManager;

    if-eqz v0, :cond_6

    .line 3216
    iget-object v0, p0, Lazm;->o:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 3217
    if-eqz v0, :cond_8

    .line 3218
    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v0

    .line 3221
    :goto_3
    iget-object v1, p0, Lazm;->p:Ljava/lang/String;

    if-eqz v1, :cond_5

    if-eqz v0, :cond_5

    iget-object v1, p0, Lazm;->p:Ljava/lang/String;

    .line 3222
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 3226
    :cond_5
    :goto_4
    iput-object v0, p0, Lazm;->p:Ljava/lang/String;

    .line 3234
    :cond_6
    if-eqz v2, :cond_1

    iget-object v0, p0, Lazm;->a:Lazr;

    if-eqz v0, :cond_1

    .line 3235
    iget-object v0, p0, Lazm;->a:Lazr;

    invoke-interface {v0}, Lazr;->b()V

    goto/16 :goto_0

    :cond_7
    move v2, v4

    goto :goto_4

    :cond_8
    move-object v0, v3

    goto :goto_3
.end method

.method static synthetic b(Lazm;)Lblp;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lazm;->s:Lblp;

    return-object v0
.end method

.method static synthetic c(Lazm;)Lazt;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lazm;->q:Lazt;

    return-object v0
.end method

.method static synthetic d(Lazm;)Lazr;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lazm;->a:Lazr;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 442
    iget-object v0, p0, Lazm;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 444
    iget-object v0, p0, Lazm;->a:Lazr;

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lazm;->i:Landroid/os/Handler;

    new-instance v1, Lazp;

    invoke-direct {v1, p0}, Lazp;-><init>(Lazm;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 454
    :cond_0
    return-void
.end method

.method private e()V
    .locals 1

    .prologue
    .line 457
    iget-boolean v0, p0, Lazm;->r:Z

    if-nez v0, :cond_0

    .line 459
    const/4 v0, 0x1

    iput-boolean v0, p0, Lazm;->r:Z

    .line 460
    iget-object v0, p0, Lazm;->a:Lazr;

    if-eqz v0, :cond_0

    .line 461
    iget-object v0, p0, Lazm;->a:Lazr;

    invoke-interface {v0}, Lazr;->a()V

    .line 464
    :cond_0
    return-void
.end method

.method static synthetic e(Lazm;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lazm;->e()V

    return-void
.end method

.method static synthetic f(Lazm;)Landroid/net/ConnectivityManager;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lazm;->m:Landroid/net/ConnectivityManager;

    return-object v0
.end method

.method static synthetic g(Lazm;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lazm;->r:Z

    return v0
.end method

.method static synthetic h(Lazm;)V
    .locals 0

    .prologue
    .line 48
    invoke-virtual {p0}, Lazm;->b()V

    return-void
.end method

.method static synthetic i(Lazm;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Lazm;->d()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 152
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lazm;->q:Lazt;

    if-eqz v0, :cond_1

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 1575
    :cond_1
    iget-object v0, p0, Lazm;->n:Lazq;

    if-nez v0, :cond_2

    .line 1578
    new-instance v0, Lazq;

    .line 1595
    invoke-direct {v0, p0}, Lazq;-><init>(Lazm;)V

    .line 1578
    iput-object v0, p0, Lazm;->n:Lazq;

    .line 1579
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1580
    iget-object v1, p0, Lazm;->c:Landroid/content/Context;

    iget-object v2, p0, Lazm;->n:Lazq;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 158
    :cond_2
    new-instance v0, Lazt;

    .line 2282
    invoke-direct {v0, p0}, Lazt;-><init>(Lazm;)V

    .line 158
    iput-object v0, p0, Lazm;->q:Lazt;

    .line 159
    iget-object v0, p0, Lazm;->q:Lazt;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lazt;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0
.end method

.method b()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 247
    iget-object v0, p0, Lazm;->q:Lazt;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lazm;->q:Lazt;

    invoke-virtual {v0, v1}, Lazt;->cancel(Z)Z

    .line 249
    const/4 v0, 0x0

    iput-object v0, p0, Lazm;->q:Lazt;

    .line 252
    :cond_0
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 277
    :goto_0
    return-void

    .line 259
    :cond_1
    iput-boolean v1, p0, Lazm;->j:Z

    .line 261
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/MulticastSocket;

    .line 262
    invoke-virtual {v0}, Ljava/net/MulticastSocket;->close()V

    goto :goto_1

    .line 265
    :cond_2
    iget-object v0, p0, Lazm;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Thread;

    .line 266
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 269
    :goto_3
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 271
    :catch_0
    move-exception v2

    goto :goto_3

    .line 274
    :cond_3
    iget-object v0, p0, Lazm;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 276
    iget-object v0, p0, Lazm;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_0
.end method

.method c()V
    .locals 2

    .prologue
    .line 584
    iget-object v0, p0, Lazm;->n:Lazq;

    if-nez v0, :cond_0

    .line 593
    :goto_0
    return-void

    .line 588
    :cond_0
    :try_start_0
    iget-object v0, p0, Lazm;->c:Landroid/content/Context;

    iget-object v1, p0, Lazm;->n:Lazq;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 592
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lazm;->n:Lazq;

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method
