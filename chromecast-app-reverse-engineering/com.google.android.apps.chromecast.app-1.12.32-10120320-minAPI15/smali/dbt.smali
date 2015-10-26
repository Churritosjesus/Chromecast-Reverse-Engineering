.class public final Ldbt;
.super Ldew;
.source "PG"


# static fields
.field private static volatile d:[Ldbt;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1037
    iput-object v0, p0, Ldbt;->a:Ljava/lang/String;

    .line 1038
    iput-object v0, p0, Ldbt;->b:Ljava/lang/String;

    .line 1039
    iput-object v0, p0, Ldbt;->c:Ljava/lang/String;

    .line 1040
    const/4 v0, -0x1

    iput v0, p0, Ldbt;->t:I

    .line 34
    return-void
.end method

.method public static b()[Ldbt;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldbt;->d:[Ldbt;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldbt;->d:[Ldbt;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldbt;

    sput-object v0, Ldbt;->d:[Ldbt;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldbt;->d:[Ldbt;

    return-object v0

    .line 18
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
    .line 61
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 62
    iget-object v1, p0, Ldbt;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 63
    const/4 v1, 0x1

    iget-object v2, p0, Ldbt;->a:Ljava/lang/String;

    .line 64
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 66
    :cond_0
    iget-object v1, p0, Ldbt;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 67
    const/4 v1, 0x2

    iget-object v2, p0, Ldbt;->b:Ljava/lang/String;

    .line 68
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 70
    :cond_1
    iget-object v1, p0, Ldbt;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 71
    const/4 v1, 0x3

    iget-object v2, p0, Ldbt;->c:Ljava/lang/String;

    .line 72
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 74
    :cond_2
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 5
    .line 1082
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1083
    sparse-switch v0, :sswitch_data_0

    .line 1087
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1088
    :sswitch_0
    return-object p0

    .line 1093
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbt;->a:Ljava/lang/String;

    goto :goto_0

    .line 1097
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbt;->b:Ljava/lang/String;

    goto :goto_0

    .line 1101
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbt;->c:Ljava/lang/String;

    goto :goto_0

    .line 1083
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 47
    iget-object v0, p0, Ldbt;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 48
    const/4 v0, 0x1

    iget-object v1, p0, Ldbt;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 50
    :cond_0
    iget-object v0, p0, Ldbt;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 51
    const/4 v0, 0x2

    iget-object v1, p0, Ldbt;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 53
    :cond_1
    iget-object v0, p0, Ldbt;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 54
    const/4 v0, 0x3

    iget-object v1, p0, Ldbt;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 56
    :cond_2
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 57
    return-void
.end method
