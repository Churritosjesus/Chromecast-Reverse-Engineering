.class public final Ldgu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldfa;


# static fields
.field public static final a:Ldfa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    new-instance v0, Ldgu;

    invoke-direct {v0}, Ldgu;-><init>()V

    sput-object v0, Ldgu;->a:Ldfa;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;
    .locals 2

    .prologue
    .line 85
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    .line 86
    invoke-virtual {p0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    .line 87
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/net/Proxy;Ldgc;)Ldfy;
    .locals 12

    .prologue
    .line 39
    invoke-virtual {p2}, Ldgc;->b()Ljava/util/List;

    move-result-object v9

    .line 1075
    iget-object v10, p2, Ldgc;->a:Ldfy;

    .line 41
    invoke-virtual {v10}, Ldfy;->a()Ljava/net/URL;

    move-result-object v6

    .line 42
    const/4 v0, 0x0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    move v8, v0

    :goto_0
    if-ge v8, v11, :cond_1

    .line 43
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ldff;

    .line 44
    const-string v0, "Basic"

    .line 2032
    iget-object v1, v5, Ldff;->a:Ljava/lang/String;

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {v6}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v6}, Ldgu;->a(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;

    move-result-object v1

    invoke-static {v6}, Ldgs;->a(Ljava/net/URL;)I

    move-result v2

    .line 48
    invoke-virtual {v6}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    .line 2037
    iget-object v4, v5, Ldff;->b:Ljava/lang/String;

    .line 3032
    iget-object v5, v5, Ldff;->a:Ljava/lang/String;

    .line 48
    sget-object v7, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    .line 46
    invoke-static/range {v0 .. v7}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v0

    .line 50
    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-static {v1, v2}, La;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    invoke-virtual {v10}, Ldfy;->c()Ldfz;

    move-result-object v1

    const-string v2, "Authorization"

    .line 54
    invoke-virtual {v1, v2, v0}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ldfz;->a()Ldfy;

    move-result-object v0

    .line 57
    :goto_1
    return-object v0

    .line 42
    :cond_0
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b(Ljava/net/Proxy;Ldgc;)Ldfy;
    .locals 12

    .prologue
    .line 62
    invoke-virtual {p2}, Ldgc;->b()Ljava/util/List;

    move-result-object v9

    .line 3075
    iget-object v10, p2, Ldgc;->a:Ldfy;

    .line 64
    invoke-virtual {v10}, Ldfy;->a()Ljava/net/URL;

    move-result-object v6

    .line 65
    const/4 v0, 0x0

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    move v8, v0

    :goto_0
    if-ge v8, v11, :cond_1

    .line 66
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ldff;

    .line 67
    const-string v0, "Basic"

    .line 4032
    iget-object v1, v5, Ldff;->a:Ljava/lang/String;

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/net/InetSocketAddress;

    .line 71
    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v6}, Ldgu;->a(Ljava/net/Proxy;Ljava/net/URL;)Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v2

    .line 72
    invoke-virtual {v6}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v3

    .line 4037
    iget-object v4, v5, Ldff;->b:Ljava/lang/String;

    .line 5032
    iget-object v5, v5, Ldff;->a:Ljava/lang/String;

    .line 72
    sget-object v7, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    .line 70
    invoke-static/range {v0 .. v7}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v0

    .line 74
    if-eqz v0, :cond_0

    .line 76
    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-static {v1, v2}, La;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-virtual {v10}, Ldfy;->c()Ldfz;

    move-result-object v1

    const-string v2, "Proxy-Authorization"

    .line 78
    invoke-virtual {v1, v2, v0}, Ldfz;->a(Ljava/lang/String;Ljava/lang/String;)Ldfz;

    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ldfz;->a()Ldfy;

    move-result-object v0

    .line 81
    :goto_1
    return-object v0

    .line 65
    :cond_0
    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    .line 81
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
