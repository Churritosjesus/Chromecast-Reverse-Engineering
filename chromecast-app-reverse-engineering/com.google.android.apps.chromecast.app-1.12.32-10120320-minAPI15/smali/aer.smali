.class public final Laer;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Laew;

.field final b:Ljava/util/HashMap;

.field final c:Ljava/util/HashMap;

.field d:Ljava/lang/Runnable;

.field private final e:Ladv;

.field private f:I

.field private final g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ladv;Laew;)V
    .locals 2

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/16 v0, 0x64

    iput v0, p0, Laer;->f:I

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Laer;->b:Ljava/util/HashMap;

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Laer;->c:Ljava/util/HashMap;

    .line 64
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Laer;->g:Landroid/os/Handler;

    .line 85
    iput-object p1, p0, Laer;->e:Ladv;

    .line 86
    iput-object p2, p0, Laer;->a:Laew;

    .line 87
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Laey;)Laex;
    .locals 13

    .prologue
    .line 182
    .line 1191
    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 1491
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 1492
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ImageLoader must be invoked from the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1503
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "#W"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#H"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#S"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1216
    iget-object v0, p0, Laer;->a:Laew;

    invoke-interface {v0, v4}, Laew;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 1217
    if-eqz v2, :cond_1

    .line 1219
    new-instance v0, Laex;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Laex;-><init>(Laer;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Laey;)V

    .line 1220
    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Laey;->a(Laex;Z)V

    .line 1236
    :goto_0
    return-object v0

    .line 1225
    :cond_1
    new-instance v0, Laex;

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Laex;-><init>(Laer;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Laey;)V

    .line 1229
    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Laey;->a(Laex;Z)V

    .line 1232
    iget-object v1, p0, Laer;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laev;

    .line 1233
    if-eqz v1, :cond_2

    .line 2432
    iget-object v1, v1, Laev;->c:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3252
    :cond_2
    new-instance v5, Laez;

    new-instance v7, Laes;

    invoke-direct {v7, p0, v4}, Laes;-><init>(Laer;Ljava/lang/String;)V

    sget-object v11, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    new-instance v12, Laet;

    invoke-direct {v12, p0, v4}, Laet;-><init>(Laer;Ljava/lang/String;)V

    move-object v6, p1

    invoke-direct/range {v5 .. v12}, Laez;-><init>(Ljava/lang/String;Laea;IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;Ladz;)V

    .line 1244
    iget-object v1, p0, Laer;->e:Ladv;

    invoke-virtual {v1, v5}, Ladv;->a(Lads;)Lads;

    .line 1245
    iget-object v1, p0, Laer;->b:Ljava/util/HashMap;

    new-instance v2, Laev;

    invoke-direct {v2, p0, v5, v0}, Laev;-><init>(Laer;Lads;Laex;)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method a(Ljava/lang/String;Laev;)V
    .locals 4

    .prologue
    .line 457
    iget-object v0, p0, Laer;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    iget-object v0, p0, Laer;->d:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 461
    new-instance v0, Laeu;

    invoke-direct {v0, p0}, Laeu;-><init>(Laer;)V

    iput-object v0, p0, Laer;->d:Ljava/lang/Runnable;

    .line 486
    iget-object v0, p0, Laer;->g:Landroid/os/Handler;

    iget-object v1, p0, Laer;->d:Ljava/lang/Runnable;

    iget v2, p0, Laer;->f:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 488
    :cond_0
    return-void
.end method
