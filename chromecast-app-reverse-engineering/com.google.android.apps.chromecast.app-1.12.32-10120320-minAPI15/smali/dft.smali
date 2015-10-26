.class public Ldft;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field static final a:Ljava/util/List;

.field static final b:Ljava/util/List;

.field private static y:Ljavax/net/ssl/SSLSocketFactory;


# instance fields
.field private final A:Ljava/util/List;

.field final c:Ldgr;

.field public d:Ljava/net/Proxy;

.field public e:Ljava/util/List;

.field public f:Ljava/util/List;

.field public final g:Ljava/util/List;

.field public h:Ljava/net/ProxySelector;

.field public i:Ljava/net/CookieHandler;

.field public j:Ls;

.field public k:Ldh;

.field public l:Ljavax/net/SocketFactory;

.field public m:Ljavax/net/ssl/SSLSocketFactory;

.field public n:Ljavax/net/ssl/HostnameVerifier;

.field public o:Ldfd;

.field public p:Ldfa;

.field public q:Ldfi;

.field r:Ldgk;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field x:I

.field private z:Ldfm;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 57
    new-array v0, v5, [Ldfx;

    sget-object v1, Ldfx;->d:Ldfx;

    aput-object v1, v0, v2

    sget-object v1, Ldfx;->c:Ldfx;

    aput-object v1, v0, v3

    sget-object v1, Ldfx;->b:Ldfx;

    aput-object v1, v0, v4

    invoke-static {v0}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ldft;->a:Ljava/util/List;

    .line 60
    new-array v0, v5, [Ldfk;

    sget-object v1, Ldfk;->a:Ldfk;

    aput-object v1, v0, v2

    sget-object v1, Ldfk;->b:Ldfk;

    aput-object v1, v0, v3

    sget-object v1, Ldfk;->c:Ldfk;

    aput-object v1, v0, v4

    invoke-static {v0}, Ldgs;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ldft;->b:Ljava/util/List;

    .line 64
    new-instance v0, Ldfu;

    invoke-direct {v0}, Ldfu;-><init>()V

    sput-object v0, Ldgi;->b:Ldgi;

    .line 161
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldft;->A:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldft;->g:Ljava/util/List;

    .line 187
    iput-boolean v1, p0, Ldft;->s:Z

    .line 188
    iput-boolean v1, p0, Ldft;->t:Z

    .line 189
    iput-boolean v1, p0, Ldft;->u:Z

    .line 195
    new-instance v0, Ldgr;

    invoke-direct {v0}, Ldgr;-><init>()V

    iput-object v0, p0, Ldft;->c:Ldgr;

    .line 196
    new-instance v0, Ldfm;

    invoke-direct {v0}, Ldfm;-><init>()V

    iput-object v0, p0, Ldft;->z:Ldfm;

    .line 197
    return-void
.end method

.method constructor <init>(Ldft;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldft;->A:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldft;->g:Ljava/util/List;

    .line 187
    iput-boolean v1, p0, Ldft;->s:Z

    .line 188
    iput-boolean v1, p0, Ldft;->t:Z

    .line 189
    iput-boolean v1, p0, Ldft;->u:Z

    .line 200
    iget-object v0, p1, Ldft;->c:Ldgr;

    iput-object v0, p0, Ldft;->c:Ldgr;

    .line 201
    iget-object v0, p1, Ldft;->z:Ldfm;

    iput-object v0, p0, Ldft;->z:Ldfm;

    .line 202
    iget-object v0, p1, Ldft;->d:Ljava/net/Proxy;

    iput-object v0, p0, Ldft;->d:Ljava/net/Proxy;

    .line 203
    iget-object v0, p1, Ldft;->e:Ljava/util/List;

    iput-object v0, p0, Ldft;->e:Ljava/util/List;

    .line 204
    iget-object v0, p1, Ldft;->f:Ljava/util/List;

    iput-object v0, p0, Ldft;->f:Ljava/util/List;

    .line 205
    iget-object v0, p0, Ldft;->A:Ljava/util/List;

    iget-object v1, p1, Ldft;->A:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 206
    iget-object v0, p0, Ldft;->g:Ljava/util/List;

    iget-object v1, p1, Ldft;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 207
    iget-object v0, p1, Ldft;->h:Ljava/net/ProxySelector;

    iput-object v0, p0, Ldft;->h:Ljava/net/ProxySelector;

    .line 208
    iget-object v0, p1, Ldft;->i:Ljava/net/CookieHandler;

    iput-object v0, p0, Ldft;->i:Ljava/net/CookieHandler;

    .line 209
    iget-object v0, p1, Ldft;->k:Ldh;

    iput-object v0, p0, Ldft;->k:Ldh;

    .line 210
    iget-object v0, p0, Ldft;->k:Ldh;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ldft;->j:Ls;

    .line 211
    iget-object v0, p1, Ldft;->l:Ljavax/net/SocketFactory;

    iput-object v0, p0, Ldft;->l:Ljavax/net/SocketFactory;

    .line 212
    iget-object v0, p1, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Ldft;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 213
    iget-object v0, p1, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Ldft;->n:Ljavax/net/ssl/HostnameVerifier;

    .line 214
    iget-object v0, p1, Ldft;->o:Ldfd;

    iput-object v0, p0, Ldft;->o:Ldfd;

    .line 215
    iget-object v0, p1, Ldft;->p:Ldfa;

    iput-object v0, p0, Ldft;->p:Ldfa;

    .line 216
    iget-object v0, p1, Ldft;->q:Ldfi;

    iput-object v0, p0, Ldft;->q:Ldfi;

    .line 217
    iget-object v0, p1, Ldft;->r:Ldgk;

    iput-object v0, p0, Ldft;->r:Ldgk;

    .line 218
    iget-boolean v0, p1, Ldft;->s:Z

    iput-boolean v0, p0, Ldft;->s:Z

    .line 219
    iget-boolean v0, p1, Ldft;->t:Z

    iput-boolean v0, p0, Ldft;->t:Z

    .line 220
    iget-boolean v0, p1, Ldft;->u:Z

    iput-boolean v0, p0, Ldft;->u:Z

    .line 221
    iget v0, p1, Ldft;->v:I

    iput v0, p0, Ldft;->v:I

    .line 222
    iget v0, p1, Ldft;->w:I

    iput v0, p0, Ldft;->w:I

    .line 223
    iget v0, p1, Ldft;->x:I

    iput v0, p0, Ldft;->x:I

    .line 224
    return-void

    .line 210
    :cond_0
    iget-object v0, p1, Ldft;->j:Ls;

    goto :goto_0
.end method

.method static synthetic a(Ldft;)Ldgk;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Ldft;->r:Ldgk;

    return-object v0
.end method


# virtual methods
.method declared-synchronized a()Ljavax/net/ssl/SSLSocketFactory;
    .locals 4

    .prologue
    .line 661
    monitor-enter p0

    :try_start_0
    sget-object v0, Ldft;->y:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 663
    :try_start_1
    const-string v0, "TLS"

    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    .line 664
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 665
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    sput-object v0, Ldft;->y:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 670
    :cond_0
    :try_start_2
    sget-object v0, Ldft;->y:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    .line 667
    :catch_0
    move-exception v0

    :try_start_3
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 661
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b()Ldft;
    .locals 1

    .prologue
    .line 675
    new-instance v0, Ldft;

    invoke-direct {v0, p0}, Ldft;-><init>(Ldft;)V

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Ldft;->b()Ldft;

    move-result-object v0

    return-object v0
.end method
