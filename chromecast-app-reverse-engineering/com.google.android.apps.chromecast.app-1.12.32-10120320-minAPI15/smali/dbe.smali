.class public final Ldbe;
.super Ldew;
.source "PG"


# static fields
.field private static volatile f:[Ldbe;


# instance fields
.field public a:Ldbj;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 289
    invoke-direct {p0}, Ldew;-><init>()V

    .line 290
    iput-object v0, p0, Ldbe;->a:Ldbj;

    .line 291
    iput-object v0, p0, Ldbe;->g:Ljava/lang/String;

    .line 292
    iput-object v0, p0, Ldbe;->b:Ljava/lang/String;

    .line 293
    iput-object v0, p0, Ldbe;->c:Ljava/lang/String;

    .line 294
    iput-object v0, p0, Ldbe;->d:Ljava/lang/String;

    .line 295
    iput-object v0, p0, Ldbe;->e:Ljava/lang/String;

    .line 296
    const/4 v0, -0x1

    iput v0, p0, Ldbe;->t:I

    .line 297
    return-void
.end method

.method public static b()[Ldbe;
    .locals 2

    .prologue
    .line 260
    sget-object v0, Ldbe;->f:[Ldbe;

    if-nez v0, :cond_1

    .line 261
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 263
    :try_start_0
    sget-object v0, Ldbe;->f:[Ldbe;

    if-nez v0, :cond_0

    .line 264
    const/4 v0, 0x0

    new-array v0, v0, [Ldbe;

    sput-object v0, Ldbe;->f:[Ldbe;

    .line 266
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    :cond_1
    sget-object v0, Ldbe;->f:[Ldbe;

    return-object v0

    .line 266
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 325
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 326
    iget-object v1, p0, Ldbe;->a:Ldbj;

    if-eqz v1, :cond_0

    .line 327
    const/4 v1, 0x1

    iget-object v2, p0, Ldbe;->a:Ldbj;

    .line 328
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 330
    :cond_0
    iget-object v1, p0, Ldbe;->g:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 331
    const/4 v1, 0x2

    iget-object v2, p0, Ldbe;->g:Ljava/lang/String;

    .line 332
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 334
    :cond_1
    iget-object v1, p0, Ldbe;->b:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 335
    const/4 v1, 0x3

    iget-object v2, p0, Ldbe;->b:Ljava/lang/String;

    .line 336
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 338
    :cond_2
    iget-object v1, p0, Ldbe;->c:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 339
    const/4 v1, 0x4

    iget-object v2, p0, Ldbe;->c:Ljava/lang/String;

    .line 340
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 342
    :cond_3
    iget-object v1, p0, Ldbe;->d:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 343
    const/4 v1, 0x5

    iget-object v2, p0, Ldbe;->d:Ljava/lang/String;

    .line 344
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 346
    :cond_4
    iget-object v1, p0, Ldbe;->e:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 347
    const/4 v1, 0x6

    iget-object v2, p0, Ldbe;->e:Ljava/lang/String;

    .line 348
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 350
    :cond_5
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 254
    .line 1358
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1359
    sparse-switch v0, :sswitch_data_0

    .line 1363
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1364
    :sswitch_0
    return-object p0

    .line 1369
    :sswitch_1
    iget-object v0, p0, Ldbe;->a:Ldbj;

    if-nez v0, :cond_1

    .line 1370
    new-instance v0, Ldbj;

    invoke-direct {v0}, Ldbj;-><init>()V

    iput-object v0, p0, Ldbe;->a:Ldbj;

    .line 1372
    :cond_1
    iget-object v0, p0, Ldbe;->a:Ldbj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1376
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbe;->g:Ljava/lang/String;

    goto :goto_0

    .line 1380
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbe;->b:Ljava/lang/String;

    goto :goto_0

    .line 1384
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbe;->c:Ljava/lang/String;

    goto :goto_0

    .line 1388
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbe;->d:Ljava/lang/String;

    goto :goto_0

    .line 1392
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbe;->e:Ljava/lang/String;

    goto :goto_0

    .line 1359
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Ldbe;->a:Ldbj;

    if-eqz v0, :cond_0

    .line 303
    const/4 v0, 0x1

    iget-object v1, p0, Ldbe;->a:Ldbj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 305
    :cond_0
    iget-object v0, p0, Ldbe;->g:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 306
    const/4 v0, 0x2

    iget-object v1, p0, Ldbe;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 308
    :cond_1
    iget-object v0, p0, Ldbe;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 309
    const/4 v0, 0x3

    iget-object v1, p0, Ldbe;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 311
    :cond_2
    iget-object v0, p0, Ldbe;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 312
    const/4 v0, 0x4

    iget-object v1, p0, Ldbe;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 314
    :cond_3
    iget-object v0, p0, Ldbe;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 315
    const/4 v0, 0x5

    iget-object v1, p0, Ldbe;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 317
    :cond_4
    iget-object v0, p0, Ldbe;->e:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 318
    const/4 v0, 0x6

    iget-object v1, p0, Ldbe;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 320
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 321
    return-void
.end method
