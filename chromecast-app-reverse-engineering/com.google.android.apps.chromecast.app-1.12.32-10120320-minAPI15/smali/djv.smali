.class final Ldjv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ldku;


# instance fields
.field private synthetic a:Ldku;

.field private synthetic b:Ldju;


# direct methods
.method constructor <init>(Ldju;Ldku;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Ldjv;->b:Ldju;

    iput-object p2, p0, Ldjv;->a:Ldku;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ldkw;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Ldjv;->b:Ldju;

    return-object v0
.end method

.method public final a_(Ldjz;J)V
    .locals 4

    .prologue
    .line 153
    iget-object v0, p0, Ldjv;->b:Ldju;

    invoke-virtual {v0}, Ldju;->j_()V

    .line 155
    :try_start_0
    iget-object v0, p0, Ldjv;->a:Ldku;

    invoke-interface {v0, p1, p2, p3}, Ldku;->a_(Ldjz;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    iget-object v0, p0, Ldjv;->b:Ldju;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldju;->a(Z)V

    .line 161
    return-void

    .line 157
    :catch_0
    move-exception v0

    .line 158
    :try_start_1
    iget-object v1, p0, Ldjv;->b:Ldju;

    invoke-virtual {v1, v0}, Ldju;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldjv;->b:Ldju;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ldju;->a(Z)V

    throw v0
.end method

.method public final close()V
    .locals 3

    .prologue
    .line 179
    iget-object v0, p0, Ldjv;->b:Ldju;

    invoke-virtual {v0}, Ldju;->j_()V

    .line 181
    :try_start_0
    iget-object v0, p0, Ldjv;->a:Ldku;

    invoke-interface {v0}, Ldku;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    iget-object v0, p0, Ldjv;->b:Ldju;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldju;->a(Z)V

    .line 187
    return-void

    .line 183
    :catch_0
    move-exception v0

    .line 184
    :try_start_1
    iget-object v1, p0, Ldjv;->b:Ldju;

    invoke-virtual {v1, v0}, Ldju;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldjv;->b:Ldju;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ldju;->a(Z)V

    throw v0
.end method

.method public final flush()V
    .locals 3

    .prologue
    .line 166
    iget-object v0, p0, Ldjv;->b:Ldju;

    invoke-virtual {v0}, Ldju;->j_()V

    .line 168
    :try_start_0
    iget-object v0, p0, Ldjv;->a:Ldku;

    invoke-interface {v0}, Ldku;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    iget-object v0, p0, Ldjv;->b:Ldju;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ldju;->a(Z)V

    .line 174
    return-void

    .line 170
    :catch_0
    move-exception v0

    .line 171
    :try_start_1
    iget-object v1, p0, Ldjv;->b:Ldju;

    invoke-virtual {v1, v0}, Ldju;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldjv;->b:Ldju;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ldju;->a(Z)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncTimeout.sink("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldjv;->a:Ldku;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
