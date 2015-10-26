.class public Lapk;
.super Lapt;
.source "PG"


# static fields
.field private static final b:Lblp;


# instance fields
.field public a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 32
    new-instance v0, Lblp;

    const-string v1, "CastConnection"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lapk;->b:Lblp;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 58
    invoke-direct {p0}, Lapt;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lapk;->c:Ljava/util/List;

    .line 4000
    iget-object v0, p1, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 60
    invoke-direct {p0, p1, p2, p0}, Lapk;->a(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;Lapt;)V

    .line 61
    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;Lapt;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Lapt;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lapk;->c:Ljava/util/List;

    .line 3000
    iget-object v0, p1, Lcom/google/android/gms/cast/CastDevice;->b:Ljava/lang/String;

    .line 52
    invoke-direct {p0, p1, p2, p3}, Lapk;->a(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;Lapt;)V

    .line 53
    return-void
.end method

.method public static a(Luh;Landroid/content/Context;Lapt;)Lapk;
    .locals 2

    .prologue
    .line 43
    new-instance v0, Lapk;

    .line 2231
    iget-object v1, p0, Luh;->m:Landroid/os/Bundle;

    .line 43
    invoke-static {v1}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)Lcom/google/android/gms/cast/CastDevice;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lapk;-><init>(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;Lapt;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/cast/CastDevice;Landroid/content/Context;Lapt;)V
    .locals 3

    .prologue
    .line 64
    .line 5000
    new-instance v0, Lbtb;

    .line 6000
    invoke-direct {v0, p1, p3}, Lbtb;-><init>(Lcom/google/android/gms/cast/CastDevice;Lbtc;)V

    .line 7000
    new-instance v1, Lbta;

    .line 8000
    invoke-direct {v1, v0}, Lbta;-><init>(Lbtb;)V

    .line 65
    new-instance v0, Lbwf;

    .line 66
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lbwf;-><init>(Landroid/content/Context;)V

    sget-object v2, Lbsr;->a:Lbvz;

    .line 67
    invoke-virtual {v0, v2, v1}, Lbwf;->a(Lbvz;Lbwb;)Lbwf;

    move-result-object v0

    .line 69
    invoke-virtual {v0, p3}, Lbwf;->a(Lbwg;)Lbwf;

    .line 70
    invoke-virtual {v0, p3}, Lbwf;->a(Lbwh;)Lbwf;

    .line 71
    invoke-virtual {v0}, Lbwf;->b()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 72
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    .line 75
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;ZLbwn;)V
    .locals 1

    .prologue
    .line 139
    new-instance v0, Lapm;

    invoke-direct {v0, p0, p2, p1, p3}, Lapm;-><init>(Lapk;ZLjava/lang/String;Lbwn;)V

    .line 151
    invoke-virtual {p0, v0}, Lapk;->a(Ljava/lang/Runnable;)V

    .line 152
    return-void
.end method

.method static synthetic d()Lblp;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lapk;->b:Lblp;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 82
    iget-object v1, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 84
    :try_start_0
    sget-object v1, Lbsr;->b:Lbsu;

    iget-object v2, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1, v2}, Lbsu;->d(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/cast/ApplicationMetadata;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 91
    :cond_0
    :goto_0
    return-object v0

    .line 85
    :catch_0
    move-exception v1

    .line 87
    sget-object v2, Lapk;->b:Lblp;

    const-string v3, "Error getting app status from GMS: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 277
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 278
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 272
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 273
    return-void
.end method

.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2

    .prologue
    .line 282
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 283
    return-void
.end method

.method public final a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_1

    .line 135
    :cond_0
    :goto_0
    return-void

    .line 111
    :cond_1
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 114
    :cond_2
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    new-instance v1, Lapl;

    invoke-direct {v1, p0, p1}, Lapl;-><init>(Lapk;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwg;)V

    .line 130
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lbwn;)V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lapk;->a(Ljava/lang/String;ZLbwn;)V

    .line 96
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 177
    new-instance v0, Lapo;

    invoke-direct {v0, p0, p1, p2, p3}, Lapo;-><init>(Lapk;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 195
    invoke-virtual {p0, v0}, Lapk;->a(Ljava/lang/Runnable;)V

    .line 196
    return-void
.end method

.method public a(ZZ)V
    .locals 1

    .prologue
    .line 239
    new-instance v0, Lapq;

    invoke-direct {v0, p0, p1, p2}, Lapq;-><init>(Lapk;ZZ)V

    invoke-virtual {p0, v0}, Lapk;->a(Ljava/lang/Runnable;)V

    .line 268
    return-void
.end method

.method public final a(Ljava/lang/String;Lbtd;)Z
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_0

    .line 157
    const/4 v0, 0x0

    .line 172
    :goto_0
    return v0

    .line 160
    :cond_0
    iget-object v0, p0, Lapk;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    new-instance v0, Lapn;

    invoke-direct {v0, p0, p1, p2}, Lapn;-><init>(Lapk;Ljava/lang/String;Lbtd;)V

    .line 171
    invoke-virtual {p0, v0}, Lapk;->a(Ljava/lang/Runnable;)V

    .line 172
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 203
    iget-object v0, p0, Lapk;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 205
    :try_start_0
    sget-object v2, Lbsr;->b:Lbsu;

    iget-object v3, p0, Lapk;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v2, v3, v0}, Lbsu;->c(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 206
    :catch_0
    move-exception v0

    .line 207
    sget-object v2, Lapk;->b:Lblp;

    const-string v3, "Couldn\'t remove message callback: %s"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 208
    :catch_1
    move-exception v0

    .line 209
    sget-object v2, Lapk;->b:Lblp;

    const-string v3, "Couldn\'t remove message callback: %s"

    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 212
    :cond_0
    iget-object v0, p0, Lapk;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 213
    return-void
.end method

.method public final b(I)V
    .locals 3

    .prologue
    .line 287
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 288
    return-void
.end method

.method public final b(Ljava/lang/String;Lbwn;)V
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lapk;->a(Ljava/lang/String;ZLbwn;)V

    .line 100
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 219
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lapk;->a(ZZ)V

    .line 220
    return-void
.end method
