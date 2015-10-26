.class final Lcqr;
.super Landroid/os/AsyncTask;
.source "PG"


# instance fields
.field private a:Lcqq;

.field private b:Landroid/os/ParcelFileDescriptor;

.field private c:I

.field private d:I

.field private e:I

.field private synthetic f:Lcqp;


# direct methods
.method constructor <init>(Lcqp;Lcqq;Landroid/os/ParcelFileDescriptor;III)V
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lcqr;->f:Lcqp;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 250
    iput-object p2, p0, Lcqr;->a:Lcqq;

    .line 251
    iput-object p3, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    .line 252
    iput p4, p0, Lcqr;->c:I

    .line 253
    iput p5, p0, Lcqr;->d:I

    .line 254
    iput p6, p0, Lcqr;->e:I

    .line 255
    return-void
.end method

.method private varargs a()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 262
    :try_start_0
    iget-object v1, p0, Lcqr;->f:Lcqp;

    invoke-static {v1}, Lcqp;->a(Lcqp;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 263
    iget-object v1, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    invoke-static {v1}, La;->a(Landroid/os/ParcelFileDescriptor;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 264
    if-nez v1, :cond_2

    move-object v1, v0

    .line 278
    :goto_0
    if-eqz v1, :cond_0

    .line 279
    iget-object v0, p0, Lcqr;->f:Lcqp;

    invoke-static {v0}, Lcqp;->d(Lcqp;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v2, p0, Lcqr;->a:Lcqq;

    iget-object v2, v2, Lcqq;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_1

    .line 284
    :try_start_1
    iget-object v0, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 290
    :cond_1
    :goto_1
    return-object v1

    .line 267
    :cond_2
    :try_start_2
    invoke-static {v1}, La;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 270
    :cond_3
    iget-object v1, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    iget v2, p0, Lcqr;->c:I

    iget v3, p0, Lcqr;->d:I

    iget v4, p0, Lcqr;->e:I

    iget v5, p0, Lcqr;->c:I

    int-to-float v5, v5

    iget-object v6, p0, Lcqr;->f:Lcqp;

    .line 271
    invoke-static {v6}, Lcqp;->b(Lcqp;)F

    move-result v6

    mul-float/2addr v5, v6

    iget-object v6, p0, Lcqr;->f:Lcqp;

    invoke-static {v6}, Lcqp;->c(Lcqp;)F

    move-result v6

    div-float/2addr v5, v6

    float-to-int v5, v5

    .line 270
    invoke-static {v1, v2, v3, v4, v5}, Lcqp;->a(Landroid/os/ParcelFileDescriptor;IIII)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 272
    if-nez v1, :cond_4

    move-object v1, v0

    .line 273
    goto :goto_0

    .line 275
    :cond_4
    iget v0, p0, Lcqr;->c:I

    iget-object v2, p0, Lcqr;->f:Lcqp;

    invoke-static {v2}, Lcqp;->b(Lcqp;)F

    move-result v2

    iget-object v3, p0, Lcqr;->f:Lcqp;

    invoke-static {v3}, Lcqp;->c(Lcqp;)F

    move-result v3

    div-float/2addr v2, v3

    invoke-static {v1, v0, v2}, Lcqp;->a(Landroid/graphics/Bitmap;IF)Landroid/graphics/Bitmap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 285
    :catch_0
    move-exception v0

    .line 286
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    goto :goto_1

    .line 282
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    if-eqz v1, :cond_5

    .line 284
    :try_start_3
    iget-object v1, p0, Lcqr;->b:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 287
    :cond_5
    :goto_2
    throw v0

    .line 285
    :catch_1
    move-exception v1

    .line 286
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    goto :goto_2
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 241
    invoke-direct {p0}, Lcqr;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 241
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1295
    iget-object v0, p0, Lcqr;->a:Lcqq;

    iget-object v0, v0, Lcqq;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcqr;->a:Lcqq;

    if-ne v0, v1, :cond_0

    .line 1298
    iget-object v0, p0, Lcqr;->f:Lcqp;

    iget-object v1, p0, Lcqr;->a:Lcqq;

    invoke-virtual {v0, v1, p1}, Lcqp;->a(Lcqq;Landroid/graphics/Bitmap;)V

    .line 241
    :cond_0
    return-void
.end method
