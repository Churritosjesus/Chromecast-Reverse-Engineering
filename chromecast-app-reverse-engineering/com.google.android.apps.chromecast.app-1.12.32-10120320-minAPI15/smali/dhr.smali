.class public final Ldhr;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ldez;

.field final b:Ljava/net/URI;

.field final c:Ldgr;

.field private final d:Ldgk;

.field private final e:Ldft;

.field private f:Ljava/net/Proxy;

.field private g:Ljava/net/InetSocketAddress;

.field private h:Ljava/util/List;

.field private i:I

.field private j:Ljava/util/List;

.field private k:I

.field private final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Ldez;Ljava/net/URI;Ldft;)V
    .locals 2

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldhr;->h:Ljava/util/List;

    .line 60
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldhr;->j:Ljava/util/List;

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldhr;->l:Ljava/util/List;

    .line 67
    iput-object p1, p0, Ldhr;->a:Ldez;

    .line 68
    iput-object p2, p0, Ldhr;->b:Ljava/net/URI;

    .line 69
    iput-object p3, p0, Ldhr;->e:Ldft;

    .line 70
    sget-object v0, Ldgi;->b:Ldgi;

    invoke-virtual {v0, p3}, Ldgi;->b(Ldft;)Ldgr;

    move-result-object v0

    iput-object v0, p0, Ldhr;->c:Ldgr;

    .line 71
    sget-object v0, Ldgi;->b:Ldgi;

    invoke-virtual {v0, p3}, Ldgi;->c(Ldft;)Ldgk;

    move-result-object v0

    iput-object v0, p0, Ldhr;->d:Ldgk;

    .line 1131
    iget-object v0, p1, Ldez;->a:Ljava/net/Proxy;

    .line 2129
    if-eqz v0, :cond_0

    .line 2131
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ldhr;->h:Ljava/util/List;

    .line 2142
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Ldhr;->i:I

    .line 74
    return-void

    .line 2135
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldhr;->h:Ljava/util/List;

    .line 2136
    iget-object v0, p0, Ldhr;->e:Ldft;

    .line 2314
    iget-object v0, v0, Ldft;->h:Ljava/net/ProxySelector;

    .line 2136
    invoke-virtual {v0, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object v0

    .line 2137
    if-eqz v0, :cond_1

    iget-object v1, p0, Ldhr;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2139
    :cond_1
    iget-object v0, p0, Ldhr;->h:Ljava/util/List;

    sget-object v1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 2140
    iget-object v0, p0, Ldhr;->h:Ljava/util/List;

    sget-object v1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private a(Ljava/net/Proxy;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 164
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldhr;->j:Ljava/util/List;

    .line 168
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_2

    .line 169
    :cond_0
    iget-object v0, p0, Ldhr;->a:Ldez;

    .line 7075
    iget-object v1, v0, Ldez;->b:Ljava/lang/String;

    .line 170
    iget-object v0, p0, Ldhr;->b:Ljava/net/URI;

    invoke-static {v0}, Ldgs;->a(Ljava/net/URI;)I

    move-result v0

    move v8, v0

    move-object v0, v1

    move v1, v8

    .line 182
    :goto_0
    if-lez v1, :cond_1

    const v3, 0xffff

    if-le v1, v3, :cond_5

    .line 183
    :cond_1
    new-instance v2, Ljava/net/SocketException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No route to "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; port is out of range"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 172
    :cond_2
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    .line 173
    instance-of v1, v0, Ljava/net/InetSocketAddress;

    if-nez v1, :cond_3

    .line 174
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Proxy.address() is not an InetSocketAddress: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 177
    :cond_3
    check-cast v0, Ljava/net/InetSocketAddress;

    .line 7201
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    .line 7202
    if-nez v1, :cond_4

    .line 7206
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    .line 179
    :goto_1
    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    move v8, v0

    move-object v0, v1

    move v1, v8

    goto :goto_0

    .line 7210
    :cond_4
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 188
    :cond_5
    iget-object v3, p0, Ldhr;->d:Ldgk;

    invoke-interface {v3, v0}, Ldgk;->a(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v3

    array-length v4, v3

    move v0, v2

    :goto_2
    if-ge v0, v4, :cond_6

    aget-object v5, v3, v0

    .line 189
    iget-object v6, p0, Ldhr;->j:Ljava/util/List;

    new-instance v7, Ljava/net/InetSocketAddress;

    invoke-direct {v7, v5, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 192
    :cond_6
    iput v2, p0, Ldhr;->k:I

    .line 193
    return-void
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 147
    iget v0, p0, Ldhr;->i:I

    iget-object v1, p0, Ldhr;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 215
    iget v0, p0, Ldhr;->k:I

    iget-object v1, p0, Ldhr;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()Z
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Ldhr;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 86
    invoke-direct {p0}, Ldhr;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    invoke-direct {p0}, Ldhr;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-direct {p0}, Ldhr;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Ldgf;
    .locals 4

    .prologue
    .line 93
    :goto_0
    invoke-direct {p0}, Ldhr;->d()Z

    move-result v0

    if-nez v0, :cond_4

    .line 94
    invoke-direct {p0}, Ldhr;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 95
    invoke-direct {p0}, Ldhr;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 3234
    :cond_0
    iget-object v0, p0, Ldhr;->l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldgf;

    .line 111
    :cond_1
    return-object v0

    .line 4152
    :cond_2
    invoke-direct {p0}, Ldhr;->c()Z

    move-result v0

    if-nez v0, :cond_3

    .line 4153
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No route to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldhr;->a:Ldez;

    .line 5075
    iget-object v2, v2, Ldez;->b:Ljava/lang/String;

    .line 4153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; exhausted proxy configurations: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ldhr;->h:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 4156
    :cond_3
    iget-object v0, p0, Ldhr;->h:Ljava/util/List;

    iget v1, p0, Ldhr;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldhr;->i:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    .line 4157
    invoke-direct {p0, v0}, Ldhr;->a(Ljava/net/Proxy;)V

    .line 100
    iput-object v0, p0, Ldhr;->f:Ljava/net/Proxy;

    .line 5220
    :cond_4
    invoke-direct {p0}, Ldhr;->d()Z

    move-result v0

    if-nez v0, :cond_5

    .line 5221
    new-instance v0, Ljava/net/SocketException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No route to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ldhr;->a:Ldez;

    .line 6075
    iget-object v2, v2, Ldez;->b:Ljava/lang/String;

    .line 5221
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "; exhausted inet socket addresses: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ldhr;->j:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5224
    :cond_5
    iget-object v0, p0, Ldhr;->j:Ljava/util/List;

    iget v1, p0, Ldhr;->k:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ldhr;->k:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    .line 102
    iput-object v0, p0, Ldhr;->g:Ljava/net/InetSocketAddress;

    .line 104
    new-instance v0, Ldgf;

    iget-object v1, p0, Ldhr;->a:Ldez;

    iget-object v2, p0, Ldhr;->f:Ljava/net/Proxy;

    iget-object v3, p0, Ldhr;->g:Ljava/net/InetSocketAddress;

    invoke-direct {v0, v1, v2, v3}, Ldgf;-><init>(Ldez;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 105
    iget-object v1, p0, Ldhr;->c:Ldgr;

    invoke-virtual {v1, v0}, Ldgr;->c(Ldgf;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 106
    iget-object v1, p0, Ldhr;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method
