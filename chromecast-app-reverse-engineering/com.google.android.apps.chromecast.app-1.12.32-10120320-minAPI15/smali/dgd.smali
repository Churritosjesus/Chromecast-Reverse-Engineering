.class public final Ldgd;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Ldfy;

.field public b:Ldfx;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Ldfn;

.field f:Ldfp;

.field public g:Ldge;

.field h:Ldgc;

.field i:Ldgc;

.field j:Ldgc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    const/4 v0, -0x1

    iput v0, p0, Ldgd;->c:I

    .line 234
    new-instance v0, Ldfp;

    invoke-direct {v0}, Ldfp;-><init>()V

    iput-object v0, p0, Ldgd;->f:Ldfp;

    .line 235
    return-void
.end method

.method constructor <init>(Ldgc;)V
    .locals 1

    .prologue
    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    const/4 v0, -0x1

    iput v0, p0, Ldgd;->c:I

    .line 1036
    iget-object v0, p1, Ldgc;->a:Ldfy;

    .line 238
    iput-object v0, p0, Ldgd;->a:Ldfy;

    .line 2036
    iget-object v0, p1, Ldgc;->b:Ldfx;

    .line 239
    iput-object v0, p0, Ldgd;->b:Ldfx;

    .line 3036
    iget v0, p1, Ldgc;->c:I

    .line 240
    iput v0, p0, Ldgd;->c:I

    .line 4036
    iget-object v0, p1, Ldgc;->d:Ljava/lang/String;

    .line 241
    iput-object v0, p0, Ldgd;->d:Ljava/lang/String;

    .line 5036
    iget-object v0, p1, Ldgc;->e:Ldfn;

    .line 242
    iput-object v0, p0, Ldgd;->e:Ldfn;

    .line 6036
    iget-object v0, p1, Ldgc;->f:Ldfo;

    .line 243
    invoke-virtual {v0}, Ldfo;->a()Ldfp;

    move-result-object v0

    iput-object v0, p0, Ldgd;->f:Ldfp;

    .line 7036
    iget-object v0, p1, Ldgc;->g:Ldge;

    .line 244
    iput-object v0, p0, Ldgd;->g:Ldge;

    .line 8036
    iget-object v0, p1, Ldgc;->h:Ldgc;

    .line 245
    iput-object v0, p0, Ldgd;->h:Ldgc;

    .line 9036
    iget-object v0, p1, Ldgc;->i:Ldgc;

    .line 246
    iput-object v0, p0, Ldgd;->i:Ldgc;

    .line 10036
    iget-object v0, p1, Ldgc;->j:Ldgc;

    .line 247
    iput-object v0, p0, Ldgd;->j:Ldgc;

    .line 248
    return-void
.end method

.method private static a(Ljava/lang/String;Ldgc;)V
    .locals 3

    .prologue
    .line 322
    .line 11036
    iget-object v0, p1, Ldgc;->g:Ldge;

    .line 322
    if-eqz v0, :cond_0

    .line 323
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".body != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12036
    :cond_0
    iget-object v0, p1, Ldgc;->h:Ldgc;

    .line 324
    if-eqz v0, :cond_1

    .line 325
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".networkResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13036
    :cond_1
    iget-object v0, p1, Ldgc;->i:Ldgc;

    .line 326
    if-eqz v0, :cond_2

    .line 327
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".cacheResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14036
    :cond_2
    iget-object v0, p1, Ldgc;->j:Ldgc;

    .line 328
    if-eqz v0, :cond_3

    .line 329
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".priorResponse != null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_3
    return-void
.end method


# virtual methods
.method public final a()Ldgc;
    .locals 3

    .prologue
    .line 346
    iget-object v0, p0, Ldgd;->a:Ldfy;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 347
    :cond_0
    iget-object v0, p0, Ldgd;->b:Ldfx;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 348
    :cond_1
    iget v0, p0, Ldgd;->c:I

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ldgd;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 349
    :cond_2
    new-instance v0, Ldgc;

    .line 16036
    invoke-direct {v0, p0}, Ldgc;-><init>(Ldgd;)V

    .line 349
    return-object v0
.end method

.method public final a(Ldfo;)Ldgd;
    .locals 1

    .prologue
    .line 300
    invoke-virtual {p1}, Ldfo;->a()Ldfp;

    move-result-object v0

    iput-object v0, p0, Ldgd;->f:Ldfp;

    .line 301
    return-object p0
.end method

.method public final a(Ldgc;)Ldgd;
    .locals 1

    .prologue
    .line 310
    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    invoke-static {v0, p1}, Ldgd;->a(Ljava/lang/String;Ldgc;)V

    .line 311
    :cond_0
    iput-object p1, p0, Ldgd;->h:Ldgc;

    .line 312
    return-object p0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ldgd;
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Ldgd;->f:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->c(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 281
    return-object p0
.end method

.method public final b(Ldgc;)Ldgd;
    .locals 1

    .prologue
    .line 316
    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    invoke-static {v0, p1}, Ldgd;->a(Ljava/lang/String;Ldgc;)V

    .line 317
    :cond_0
    iput-object p1, p0, Ldgd;->i:Ldgc;

    .line 318
    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ldgd;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Ldgd;->f:Ldfp;

    invoke-virtual {v0, p1, p2}, Ldfp;->a(Ljava/lang/String;Ljava/lang/String;)Ldfp;

    .line 290
    return-object p0
.end method

.method public final c(Ldgc;)Ldgd;
    .locals 2

    .prologue
    .line 334
    if-eqz p1, :cond_0

    .line 15036
    iget-object v0, p1, Ldgc;->g:Ldge;

    .line 14340
    if-eqz v0, :cond_0

    .line 14341
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "priorResponse.body != null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :cond_0
    iput-object p1, p0, Ldgd;->j:Ldgc;

    .line 336
    return-object p0
.end method
