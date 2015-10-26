.class public Lcqp;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static volatile c:Ljava/util/concurrent/Executor;

.field private static k:Z


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final d:Ljava/util/concurrent/ConcurrentHashMap;

.field private e:Z

.field private f:Lcqq;

.field private final g:Ljava/util/LinkedList;

.field private h:Z

.field private i:F

.field private j:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 49
    const/4 v0, 0x0

    sput-object v0, Lcqp;->c:Ljava/util/concurrent/Executor;

    .line 2057
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 2058
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Lcqp;->c:Ljava/util/concurrent/Executor;

    .line 62
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/api/GoogleApiClient;Z)V
    .locals 2

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcqp;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 88
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    .line 100
    iput-object p1, p0, Lcqp;->a:Landroid/content/Context;

    .line 101
    iput-object p2, p0, Lcqp;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 102
    iput-boolean p3, p0, Lcqp;->h:Z

    .line 103
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 104
    sget v1, La;->io:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcqp;->j:F

    .line 105
    sget v1, La;->in:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcqp;->i:F

    .line 106
    const-string v0, "activity"

    .line 107
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 108
    invoke-static {v0}, La;->a(Landroid/app/ActivityManager;)Z

    move-result v0

    sput-boolean v0, Lcqp;->k:Z

    .line 109
    return-void
.end method

.method private static a(IIII)I
    .locals 4

    .prologue
    .line 304
    sget-boolean v0, Lcqp;->k:Z

    if-eqz v0, :cond_1

    .line 305
    const/4 v0, 0x2

    .line 323
    :cond_0
    return v0

    .line 307
    :cond_1
    const/4 v0, 0x1

    .line 309
    if-gt p0, p3, :cond_2

    if-le p1, p2, :cond_0

    .line 311
    :cond_2
    div-int/lit8 v1, p0, 0x2

    .line 312
    div-int/lit8 v2, p1, 0x2

    .line 317
    :goto_0
    div-int v3, v1, v0

    if-lt v3, p3, :cond_0

    div-int v3, v2, v0

    if-lt v3, p2, :cond_0

    .line 319
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    .line 372
    int-to-float v0, p1

    mul-float/2addr v0, p2

    float-to-int v0, v0

    .line 1414
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 1415
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    .line 1418
    if-ne p1, v1, :cond_0

    if-ne v0, v2, :cond_0

    .line 1419
    :goto_0
    return-object p0

    .line 1422
    :cond_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 1423
    int-to-float v3, p1

    int-to-float v4, v1

    div-float/2addr v3, v4

    int-to-float v4, v0

    int-to-float v6, v2

    div-float/2addr v4, v6

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 1426
    invoke-virtual {v5, v4, v4}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 1431
    int-to-float v3, p1

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 1432
    int-to-float v0, v0

    div-float/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 1433
    int-to-float v0, v1

    mul-float/2addr v0, v7

    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    sub-float/2addr v0, v6

    float-to-int v0, v0

    .line 1434
    int-to-float v6, v2

    mul-float/2addr v6, v7

    div-int/lit8 v7, v4, 0x2

    int-to-float v7, v7

    sub-float/2addr v6, v7

    float-to-int v6, v6

    .line 1437
    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1438
    sub-int v0, v2, v4

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1440
    const/4 v6, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0
.end method

.method public static a(Landroid/os/ParcelFileDescriptor;IIII)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 328
    if-nez p0, :cond_0

    .line 349
    :goto_0
    return-object v0

    .line 331
    :cond_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 332
    invoke-static {p1, p2, p3, p4}, Lcqp;->a(IIII)I

    move-result v1

    iput v1, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 333
    const/4 v1, 0x0

    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 334
    iput p1, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 335
    iput p2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 336
    sget-boolean v1, Lcqp;->k:Z

    if-eqz v1, :cond_1

    .line 337
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v1, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 342
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 343
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v1, v0, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v0

    .line 346
    invoke-static {v1}, Lcqp;->a(Ljava/io/InputStream;)V

    goto :goto_0

    .line 345
    :catchall_0
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    :goto_1
    if-eqz v1, :cond_2

    .line 346
    invoke-static {v1}, Lcqp;->a(Ljava/io/InputStream;)V

    :cond_2
    throw v0

    .line 345
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method private a()V
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 178
    :cond_1
    iget-object v0, p0, Lcqp;->f:Lcqq;

    if-nez v0, :cond_0

    .line 181
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcqq;

    iput-object v0, p0, Lcqp;->f:Lcqq;

    .line 182
    iget-object v0, p0, Lcqp;->f:Lcqq;

    invoke-virtual {v0}, Lcqq;->a()V

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 354
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 358
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcqp;)Z
    .locals 1

    .prologue
    .line 39
    iget-boolean v0, p0, Lcqp;->h:Z

    return v0
.end method

.method static synthetic b(Lcqp;)F
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcqp;->i:F

    return v0
.end method

.method static synthetic c(Lcqp;)F
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcqp;->j:F

    return v0
.end method

.method static synthetic d(Lcqp;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcqp;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;)V
    .locals 2

    .prologue
    .line 157
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 158
    const/4 v0, 0x0

    move v1, v0

    .line 160
    :goto_0
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 161
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcqq;

    iget-object v0, v0, Lcqq;->e:Landroid/widget/ImageView;

    if-ne v0, p1, :cond_0

    .line 162
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 164
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 168
    :cond_1
    iget-object v0, p0, Lcqp;->f:Lcqq;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcqp;->f:Lcqq;

    iget-object v0, v0, Lcqq;->e:Landroid/widget/ImageView;

    if-ne v0, p1, :cond_2

    .line 169
    iget-object v0, p0, Lcqp;->f:Lcqq;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcqq;->d:Z

    .line 171
    :cond_2
    return-void
.end method

.method public final a(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;IIILcqq;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 192
    .line 194
    :try_start_0
    iget-object v0, p0, Lcqp;->f:Lcqq;

    if-eq v0, p6, :cond_2

    .line 195
    const-string v0, "AvatarManager"

    const-string v1, "Got a different request than we\'re waiting for!"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    iget-boolean v0, p0, Lcqp;->e:Z

    if-nez v0, :cond_0

    .line 221
    invoke-direct {p0}, Lcqp;->a()V

    .line 223
    :cond_0
    if-eqz p2, :cond_1

    .line 225
    :try_start_1
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    .line 230
    :cond_1
    :goto_0
    return-void

    .line 200
    :cond_2
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcqp;->f:Lcqq;

    .line 201
    iget-boolean v0, p0, Lcqp;->e:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_4

    .line 220
    iget-boolean v0, p0, Lcqp;->e:Z

    if-nez v0, :cond_3

    .line 221
    invoke-direct {p0}, Lcqp;->a()V

    .line 223
    :cond_3
    if-eqz p2, :cond_1

    .line 225
    :try_start_3
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    .line 204
    :cond_4
    :try_start_4
    iget-object v0, p6, Lcqq;->e:Landroid/widget/ImageView;

    .line 205
    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p6, :cond_5

    iget-boolean v0, p6, Lcqq;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_7

    .line 220
    :cond_5
    iget-boolean v0, p0, Lcqp;->e:Z

    if-nez v0, :cond_6

    .line 221
    invoke-direct {p0}, Lcqp;->a()V

    .line 223
    :cond_6
    if-eqz p2, :cond_1

    .line 225
    :try_start_5
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    .line 210
    :cond_7
    :try_start_6
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    if-nez p2, :cond_9

    .line 211
    :cond_8
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1c

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Avatar loaded: status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "  pfd="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    :cond_9
    if-eqz p2, :cond_a

    .line 215
    new-instance v0, Lcqr;

    move-object v1, p0

    move-object v2, p6

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lcqr;-><init>(Lcqp;Lcqq;Landroid/os/ParcelFileDescriptor;III)V

    .line 1234
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_c

    .line 1235
    sget-object v1, Lcqp;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcqr;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    move-object p2, v7

    .line 220
    :cond_a
    iget-boolean v0, p0, Lcqp;->e:Z

    if-nez v0, :cond_b

    .line 221
    invoke-direct {p0}, Lcqp;->a()V

    .line 223
    :cond_b
    if-eqz p2, :cond_1

    .line 225
    :try_start_7
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    goto/16 :goto_0

    .line 227
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 1237
    :cond_c
    const/4 v1, 0x0

    :try_start_8
    invoke-virtual {v0, v1}, Lcqr;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_1

    .line 220
    :catchall_0
    move-exception v0

    iget-boolean v1, p0, Lcqp;->e:Z

    if-nez v1, :cond_d

    .line 221
    invoke-direct {p0}, Lcqp;->a()V

    .line 223
    :cond_d
    if-eqz p2, :cond_e

    .line 225
    :try_start_9
    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 227
    :cond_e
    :goto_2
    throw v0

    :catch_3
    move-exception v0

    goto/16 :goto_0

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public final a(Lcqq;)V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcqp;->d:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p1, Lcqq;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    iget-object v1, p1, Lcqq;->e:Landroid/widget/ImageView;

    iget-object v0, p0, Lcqp;->d:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p1, Lcqq;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 129
    iget-object v0, p1, Lcqq;->e:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcqp;->a(Landroid/widget/ImageView;)V

    .line 133
    :cond_0
    :goto_0
    return-void

    .line 131
    :cond_1
    iget-object v0, p1, Lcqq;->e:Landroid/widget/ImageView;

    .line 1140
    invoke-virtual {p0, v0}, Lcqp;->a(Landroid/widget/ImageView;)V

    .line 1142
    iget-object v1, p0, Lcqp;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1147
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1148
    iget-object v0, p0, Lcqp;->g:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 1150
    invoke-direct {p0}, Lcqp;->a()V

    goto :goto_0
.end method

.method protected a(Lcqq;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 447
    if-eqz p2, :cond_0

    .line 448
    iget-object v0, p1, Lcqq;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 450
    :cond_0
    return-void
.end method
