.class public final Ldce;
.super Ldew;
.source "PG"


# static fields
.field private static volatile b:[Ldce;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1034
    const/4 v0, 0x0

    iput-object v0, p0, Ldce;->a:Ljava/lang/String;

    .line 1035
    const/4 v0, -0x1

    iput v0, p0, Ldce;->t:I

    .line 31
    return-void
.end method

.method public static b()[Ldce;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Ldce;->b:[Ldce;

    if-nez v0, :cond_1

    .line 16
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Ldce;->b:[Ldce;

    if-nez v0, :cond_0

    .line 19
    const/4 v0, 0x0

    new-array v0, v0, [Ldce;

    sput-object v0, Ldce;->b:[Ldce;

    .line 21
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :cond_1
    sget-object v0, Ldce;->b:[Ldce;

    return-object v0

    .line 21
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
    .line 50
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 51
    iget-object v1, p0, Ldce;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 52
    const/4 v1, 0x1

    iget-object v2, p0, Ldce;->a:Ljava/lang/String;

    .line 53
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 55
    :cond_0
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 9
    .line 1063
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1064
    sparse-switch v0, :sswitch_data_0

    .line 1068
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1069
    :sswitch_0
    return-object p0

    .line 1074
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldce;->a:Ljava/lang/String;

    goto :goto_0

    .line 1064
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Ldce;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 43
    const/4 v0, 0x1

    iget-object v1, p0, Ldce;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 45
    :cond_0
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 46
    return-void
.end method
