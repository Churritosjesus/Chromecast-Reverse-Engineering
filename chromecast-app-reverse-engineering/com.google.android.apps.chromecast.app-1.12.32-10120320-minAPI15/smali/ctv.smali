.class Lctv;
.super Ljava/lang/Object;

# interfaces
.implements Lbwl;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Ljava/lang/String;

.field final c:Ljava/util/concurrent/ExecutorService;

.field d:Lcwb;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 5000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lctv;->a:Landroid/content/Context;

    iput-object p2, p0, Lctv;->b:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lctv;->c:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static a(Ljava/io/ByteArrayOutputStream;)Lclz;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 12000
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 13000
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 14000
    invoke-static {v2}, La;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    move-result-object v2

    .line 13000
    invoke-static {}, Lclz;->a()Lcma;

    move-result-object v3

    const/4 v1, 0x0

    :goto_0
    iget-object v4, v2, Lcje;->d:[Lcje;

    array-length v4, v4

    if-ge v1, v4, :cond_0

    invoke-static {}, Lclx;->a()Lcly;

    move-result-object v4

    sget-object v5, Lcit;->u:Lcit;

    invoke-virtual {v5}, Lcit;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v2, Lcje;->d:[Lcje;

    aget-object v6, v6, v1

    invoke-virtual {v4, v5, v6}, Lcly;->a(Ljava/lang/String;Lcje;)Lcly;

    move-result-object v4

    sget-object v5, Lcit;->p:Lcit;

    invoke-virtual {v5}, Lcit;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcyx;->d()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcyh;->a(Ljava/lang/String;)Lcje;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcly;->a(Ljava/lang/String;Lcje;)Lcly;

    move-result-object v4

    invoke-static {}, Lcyx;->e()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v2, Lcje;->e:[Lcje;

    aget-object v6, v6, v1

    invoke-virtual {v4, v5, v6}, Lcly;->a(Ljava/lang/String;Lcje;)Lcly;

    move-result-object v4

    invoke-virtual {v4}, Lcly;->a()Lclx;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcma;->a(Lclx;)Lcma;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcma;->a()Lclz;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 12000
    :goto_1
    return-object v0

    :catch_0
    move-exception v1

    const-string v1, "Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format."

    invoke-static {v1}, Lcuh;->d(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v1, "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn\'t contain a JSON container"

    invoke-static {v1}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static a([B)Lclz;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 15000
    .line 16000
    :try_start_0
    new-instance v0, Lciz;

    invoke-direct {v0}, Lciz;-><init>()V

    invoke-static {v0, p0}, Lcms;->a(Lcms;[B)Lcms;

    move-result-object v0

    check-cast v0, Lciz;

    .line 15000
    invoke-static {v0}, La;->a(Lciz;)Lclz;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "The container was successfully loaded from the resource (using binary file)"

    invoke-static {v2}, Lcuh;->e(Ljava/lang/String;)V
    :try_end_0
    .catch Lcmr; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcmd; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v0, "The resource file is corrupted. The container cannot be extracted from the binary file"

    invoke-static {v0}, Lcuh;->a(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "The resource file is invalid. The container from the binary file is invalid"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lclz;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 4000
    :try_start_0
    iget-object v0, p0, Lctv;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attempting to load a container from the resource ID "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lctv;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcuh;->e(Ljava/lang/String;)V

    :try_start_1
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v0, v2}, La;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-static {v2}, Lctv;->a(Ljava/io/ByteArrayOutputStream;)Lclz;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "The container was successfully loaded from the resource (using JSON file format)"

    invoke-static {v2}, Lcuh;->e(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Failed to load the container. No default container resource found with the resource ID "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    :cond_0
    :try_start_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lctv;->a([B)Lclz;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error reading the default container with resource ID "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lctv;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public declared-synchronized a()V
    .locals 1

    .prologue
    .line 17000
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lctv;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Lclv;)V
    .locals 2

    .prologue
    .line 3000
    iget-object v0, p0, Lctv;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcxg;

    invoke-direct {v1, p0, p1}, Lcxg;-><init>(Lctv;Lclv;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcwb;)V
    .locals 0

    .prologue
    .line 1000
    iput-object p1, p0, Lctv;->d:Lcwb;

    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 2000
    iget-object v0, p0, Lctv;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcxf;

    invoke-direct {v1, p0}, Lcxf;-><init>(Lctv;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method b(Lclv;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 18000
    invoke-virtual {p0}, Lctv;->d()Ljava/io/File;

    move-result-object v1

    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {p1}, Lcms;->a(Lcms;)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0

    :catch_0
    move-exception v1

    const-string v1, "Error opening resource file for writing"

    invoke-static {v1}, Lcuh;->a(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v0, "error closing stream for writing resource to disk"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v3

    :try_start_3
    const-string v3, "Error writing resource to disk. Removing resource from disk."

    invoke-static {v3}, Lcuh;->b(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    :catch_3
    move-exception v1

    const-string v1, "error closing stream for writing resource to disk"

    invoke-static {v1}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :goto_2
    throw v0

    :catch_4
    move-exception v1

    const-string v1, "error closing stream for writing resource to disk"

    invoke-static {v1}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_2
.end method

.method c()V
    .locals 3

    .prologue
    .line 6000
    iget-object v0, p0, Lctv;->d:Lcwb;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Callback must be set before execute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v0, "Attempting to load resource from disk"

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V

    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v0

    .line 7000
    iget-object v0, v0, Lcuk;->a:Lcul;

    .line 6000
    sget-object v1, Lcul;->b:Lcul;

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v0

    .line 8000
    iget-object v0, v0, Lcuk;->a:Lcul;

    .line 6000
    sget-object v1, Lcul;->c:Lcul;

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lctv;->b:Ljava/lang/String;

    invoke-static {}, Lcuk;->a()Lcuk;

    move-result-object v1

    .line 9000
    iget-object v1, v1, Lcuk;->b:Ljava/lang/String;

    .line 6000
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lctv;->d:Lcwb;

    sget v1, Lcwc;->a:I

    invoke-interface {v0}, Lcwb;->a()V

    :goto_0
    return-void

    :cond_2
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Lctv;->d()Ljava/io/File;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-static {v1, v0}, La;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 10000
    new-instance v2, Lclv;

    invoke-direct {v2}, Lclv;-><init>()V

    invoke-static {v2, v0}, Lcms;->a(Lcms;[B)Lcms;

    move-result-object v0

    check-cast v0, Lclv;

    .line 11000
    iget-object v2, v0, Lclv;->b:Lciz;

    if-nez v2, :cond_3

    iget-object v2, v0, Lclv;->c:Lcjd;

    if-nez v2, :cond_3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Resource and SupplementedResource are NULL."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6000
    :catch_0
    move-exception v0

    :try_start_2
    iget-object v0, p0, Lctv;->d:Lcwb;

    sget v2, Lcwc;->b:I

    invoke-interface {v0}, Lcwb;->a()V

    const-string v0, "Failed to read the resource from disk"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :goto_1
    const-string v0, "The Disk resource was successfully read."

    invoke-static {v0}, Lcuh;->e(Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "Failed to find the resource in the disk"

    invoke-static {v0}, Lcuh;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lctv;->d:Lcwb;

    sget v1, Lcwc;->a:I

    invoke-interface {v0}, Lcwb;->a()V

    goto :goto_0

    :cond_3
    :try_start_4
    iget-object v2, p0, Lctv;->d:Lcwb;

    invoke-interface {v2, v0}, Lcwb;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v0, "Error closing stream for reading resource from disk"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1

    :catch_3
    move-exception v0

    const-string v0, "Error closing stream for reading resource from disk"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1

    :catch_4
    move-exception v0

    :try_start_6
    iget-object v0, p0, Lctv;->d:Lcwb;

    sget v2, Lcwc;->b:I

    invoke-interface {v0}, Lcwb;->a()V

    const-string v0, "Failed to read the resource from disk. The resource is inconsistent"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_1

    :catch_5
    move-exception v0

    const-string v0, "Error closing stream for reading resource from disk"

    invoke-static {v0}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    :goto_2
    throw v0

    :catch_6
    move-exception v1

    const-string v1, "Error closing stream for reading resource from disk"

    invoke-static {v1}, Lcuh;->b(Ljava/lang/String;)V

    goto :goto_2
.end method

.method d()Ljava/io/File;
    .locals 4

    .prologue
    .line 19000
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "resource_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lctv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lctv;->a:Landroid/content/Context;

    const-string v2, "google_tagmanager"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v2
.end method
