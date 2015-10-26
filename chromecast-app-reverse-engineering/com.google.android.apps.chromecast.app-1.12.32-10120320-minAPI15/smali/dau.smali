.class public final Ldau;
.super Ldew;
.source "PG"


# static fields
.field private static volatile e:[Ldau;


# instance fields
.field public a:Ldaq;

.field public b:Ldbn;

.field public c:Ldav;

.field public d:Ldbf;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Ldew;-><init>()V

    .line 39
    iput-object v0, p0, Ldau;->a:Ldaq;

    .line 40
    iput-object v0, p0, Ldau;->b:Ldbn;

    .line 41
    iput-object v0, p0, Ldau;->c:Ldav;

    .line 42
    iput-object v0, p0, Ldau;->d:Ldbf;

    .line 43
    const/4 v0, -0x1

    iput v0, p0, Ldau;->t:I

    .line 44
    return-void
.end method

.method public static b()[Ldau;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Ldau;->e:[Ldau;

    if-nez v0, :cond_1

    .line 16
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Ldau;->e:[Ldau;

    if-nez v0, :cond_0

    .line 19
    const/4 v0, 0x0

    new-array v0, v0, [Ldau;

    sput-object v0, Ldau;->e:[Ldau;

    .line 21
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :cond_1
    sget-object v0, Ldau;->e:[Ldau;

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
    .line 66
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 67
    iget-object v1, p0, Ldau;->a:Ldaq;

    if-eqz v1, :cond_0

    .line 68
    const/4 v1, 0x1

    iget-object v2, p0, Ldau;->a:Ldaq;

    .line 69
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 71
    :cond_0
    iget-object v1, p0, Ldau;->b:Ldbn;

    if-eqz v1, :cond_1

    .line 72
    const/4 v1, 0x2

    iget-object v2, p0, Ldau;->b:Ldbn;

    .line 73
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 75
    :cond_1
    iget-object v1, p0, Ldau;->c:Ldav;

    if-eqz v1, :cond_2

    .line 76
    const/4 v1, 0x3

    iget-object v2, p0, Ldau;->c:Ldav;

    .line 77
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 79
    :cond_2
    iget-object v1, p0, Ldau;->d:Ldbf;

    if-eqz v1, :cond_3

    .line 80
    const/4 v1, 0x4

    iget-object v2, p0, Ldau;->d:Ldbf;

    .line 81
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 83
    :cond_3
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 9
    .line 1091
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1092
    sparse-switch v0, :sswitch_data_0

    .line 1096
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1097
    :sswitch_0
    return-object p0

    .line 1102
    :sswitch_1
    iget-object v0, p0, Ldau;->a:Ldaq;

    if-nez v0, :cond_1

    .line 1103
    new-instance v0, Ldaq;

    invoke-direct {v0}, Ldaq;-><init>()V

    iput-object v0, p0, Ldau;->a:Ldaq;

    .line 1105
    :cond_1
    iget-object v0, p0, Ldau;->a:Ldaq;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1109
    :sswitch_2
    iget-object v0, p0, Ldau;->b:Ldbn;

    if-nez v0, :cond_2

    .line 1110
    new-instance v0, Ldbn;

    invoke-direct {v0}, Ldbn;-><init>()V

    iput-object v0, p0, Ldau;->b:Ldbn;

    .line 1112
    :cond_2
    iget-object v0, p0, Ldau;->b:Ldbn;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1116
    :sswitch_3
    iget-object v0, p0, Ldau;->c:Ldav;

    if-nez v0, :cond_3

    .line 1117
    new-instance v0, Ldav;

    invoke-direct {v0}, Ldav;-><init>()V

    iput-object v0, p0, Ldau;->c:Ldav;

    .line 1119
    :cond_3
    iget-object v0, p0, Ldau;->c:Ldav;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1123
    :sswitch_4
    iget-object v0, p0, Ldau;->d:Ldbf;

    if-nez v0, :cond_4

    .line 1124
    new-instance v0, Ldbf;

    invoke-direct {v0}, Ldbf;-><init>()V

    iput-object v0, p0, Ldau;->d:Ldbf;

    .line 1126
    :cond_4
    iget-object v0, p0, Ldau;->d:Ldbf;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1092
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Ldau;->a:Ldaq;

    if-eqz v0, :cond_0

    .line 50
    const/4 v0, 0x1

    iget-object v1, p0, Ldau;->a:Ldaq;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 52
    :cond_0
    iget-object v0, p0, Ldau;->b:Ldbn;

    if-eqz v0, :cond_1

    .line 53
    const/4 v0, 0x2

    iget-object v1, p0, Ldau;->b:Ldbn;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 55
    :cond_1
    iget-object v0, p0, Ldau;->c:Ldav;

    if-eqz v0, :cond_2

    .line 56
    const/4 v0, 0x3

    iget-object v1, p0, Ldau;->c:Ldav;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 58
    :cond_2
    iget-object v0, p0, Ldau;->d:Ldbf;

    if-eqz v0, :cond_3

    .line 59
    const/4 v0, 0x4

    iget-object v1, p0, Ldau;->d:Ldbf;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 61
    :cond_3
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 62
    return-void
.end method
