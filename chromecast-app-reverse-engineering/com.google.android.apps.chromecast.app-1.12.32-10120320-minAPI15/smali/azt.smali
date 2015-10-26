.class final Lazt;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field private synthetic a:Lazm;


# direct methods
.method constructor <init>(Lazm;)V
    .locals 0

    .prologue
    .line 282
    iput-object p1, p0, Lazt;->a:Lazm;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private varargs a()Ljava/util/List;
    .locals 5

    .prologue
    .line 286
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 289
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v3

    .line 290
    if-eqz v3, :cond_2

    .line 291
    :cond_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    invoke-virtual {p0}, Lazt;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 295
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/NetworkInterface;

    .line 296
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->isUp()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/net/NetworkInterface;->isLoopback()Z

    move-result v1

    if-nez v1, :cond_0

    .line 297
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->isPointToPoint()Z

    move-result v1

    if-nez v1, :cond_0

    .line 298
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->supportsMulticast()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 301
    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getInterfaceAddresses()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/InterfaceAddress;

    .line 303
    invoke-virtual {v1}, Ljava/net/InterfaceAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    instance-of v1, v1, Ljava/net/Inet4Address;

    if-eqz v1, :cond_1

    .line 304
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 310
    :catch_0
    move-exception v0

    iget-object v0, p0, Lazt;->a:Lazm;

    invoke-static {v0}, Lazm;->b(Lazm;)Lblp;

    .line 312
    :cond_2
    return-object v2
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 282
    invoke-direct {p0}, Lazt;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onCancelled(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 282
    .line 1334
    iget-object v0, p0, Lazt;->a:Lazm;

    invoke-static {v0}, Lazm;->c(Lazm;)Lazt;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 1335
    iget-object v0, p0, Lazt;->a:Lazm;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lazm;->a(Lazm;Lazt;)Lazt;

    .line 282
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 282
    check-cast p1, Ljava/util/List;

    .line 2317
    iget-object v0, p0, Lazt;->a:Lazm;

    invoke-static {v0}, Lazm;->c(Lazm;)Lazt;

    move-result-object v0

    if-ne v0, p0, :cond_1

    .line 2324
    if-eqz p1, :cond_0

    .line 2325
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/NetworkInterface;

    .line 2326
    iget-object v2, p0, Lazt;->a:Lazm;

    invoke-static {v2}, Lazm;->b(Lazm;)Lblp;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    goto :goto_0

    .line 2329
    :cond_0
    iget-object v0, p0, Lazt;->a:Lazm;

    invoke-static {v0, p1}, Lazm;->a(Lazm;Ljava/util/List;)V

    .line 282
    :cond_1
    return-void
.end method
