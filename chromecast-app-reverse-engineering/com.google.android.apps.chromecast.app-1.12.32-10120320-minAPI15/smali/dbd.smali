.class public final Ldbd;
.super Ldew;
.source "PG"


# static fields
.field private static volatile c:[Ldbd;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 183
    invoke-direct {p0}, Ldew;-><init>()V

    .line 184
    iput-object v0, p0, Ldbd;->a:Ljava/lang/String;

    .line 185
    iput-object v0, p0, Ldbd;->b:Ljava/lang/String;

    .line 186
    const/4 v0, -0x1

    iput v0, p0, Ldbd;->t:I

    .line 187
    return-void
.end method

.method public static b()[Ldbd;
    .locals 2

    .prologue
    .line 166
    sget-object v0, Ldbd;->c:[Ldbd;

    if-nez v0, :cond_1

    .line 167
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 169
    :try_start_0
    sget-object v0, Ldbd;->c:[Ldbd;

    if-nez v0, :cond_0

    .line 170
    const/4 v0, 0x0

    new-array v0, v0, [Ldbd;

    sput-object v0, Ldbd;->c:[Ldbd;

    .line 172
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    :cond_1
    sget-object v0, Ldbd;->c:[Ldbd;

    return-object v0

    .line 172
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
    .line 203
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 204
    iget-object v1, p0, Ldbd;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 205
    const/4 v1, 0x1

    iget-object v2, p0, Ldbd;->a:Ljava/lang/String;

    .line 206
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 208
    :cond_0
    iget-object v1, p0, Ldbd;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 209
    const/4 v1, 0x2

    iget-object v2, p0, Ldbd;->b:Ljava/lang/String;

    .line 210
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 212
    :cond_1
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 160
    .line 1220
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1221
    sparse-switch v0, :sswitch_data_0

    .line 1225
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1226
    :sswitch_0
    return-object p0

    .line 1231
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbd;->a:Ljava/lang/String;

    goto :goto_0

    .line 1235
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbd;->b:Ljava/lang/String;

    goto :goto_0

    .line 1221
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Ldbd;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 193
    const/4 v0, 0x1

    iget-object v1, p0, Ldbd;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 195
    :cond_0
    iget-object v0, p0, Ldbd;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 196
    const/4 v0, 0x2

    iget-object v1, p0, Ldbd;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 198
    :cond_1
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 199
    return-void
.end method
