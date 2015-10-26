.class public final Ldba;
.super Ldew;
.source "PG"


# static fields
.field private static volatile c:[Ldba;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/Boolean;

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ldew;-><init>()V

    .line 42
    iput-object v0, p0, Ldba;->a:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Ldba;->d:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Ldba;->e:Ljava/lang/Boolean;

    .line 45
    iput-object v0, p0, Ldba;->f:Ljava/lang/String;

    .line 46
    iput-object v0, p0, Ldba;->b:Ljava/lang/String;

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Ldba;->t:I

    .line 48
    return-void
.end method

.method public static b()[Ldba;
    .locals 2

    .prologue
    .line 15
    sget-object v0, Ldba;->c:[Ldba;

    if-nez v0, :cond_1

    .line 16
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 18
    :try_start_0
    sget-object v0, Ldba;->c:[Ldba;

    if-nez v0, :cond_0

    .line 19
    const/4 v0, 0x0

    new-array v0, v0, [Ldba;

    sput-object v0, Ldba;->c:[Ldba;

    .line 21
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :cond_1
    sget-object v0, Ldba;->c:[Ldba;

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
    .line 73
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 74
    iget-object v1, p0, Ldba;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 75
    const/4 v1, 0x1

    iget-object v2, p0, Ldba;->a:Ljava/lang/String;

    .line 76
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 78
    :cond_0
    iget-object v1, p0, Ldba;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 79
    const/4 v1, 0x2

    iget-object v2, p0, Ldba;->e:Ljava/lang/Boolean;

    .line 80
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1620
    invoke-static {v1}, Ldep;->b(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 80
    add-int/2addr v0, v1

    .line 82
    :cond_1
    iget-object v1, p0, Ldba;->f:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 83
    const/4 v1, 0x3

    iget-object v2, p0, Ldba;->f:Ljava/lang/String;

    .line 84
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 86
    :cond_2
    iget-object v1, p0, Ldba;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 87
    const/4 v1, 0x4

    iget-object v2, p0, Ldba;->b:Ljava/lang/String;

    .line 88
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 90
    :cond_3
    iget-object v1, p0, Ldba;->d:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 91
    const/4 v1, 0x5

    iget-object v2, p0, Ldba;->d:Ljava/lang/String;

    .line 92
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 94
    :cond_4
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 9
    .line 2102
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 2103
    sparse-switch v0, :sswitch_data_0

    .line 2107
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2108
    :sswitch_0
    return-object p0

    .line 2113
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldba;->a:Ljava/lang/String;

    goto :goto_0

    .line 2117
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Ldba;->e:Ljava/lang/Boolean;

    goto :goto_0

    .line 2121
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldba;->f:Ljava/lang/String;

    goto :goto_0

    .line 2125
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldba;->b:Ljava/lang/String;

    goto :goto_0

    .line 2129
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldba;->d:Ljava/lang/String;

    goto :goto_0

    .line 2103
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Ldba;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 54
    const/4 v0, 0x1

    iget-object v1, p0, Ldba;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 56
    :cond_0
    iget-object v0, p0, Ldba;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 57
    const/4 v0, 0x2

    iget-object v1, p0, Ldba;->e:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(IZ)V

    .line 59
    :cond_1
    iget-object v0, p0, Ldba;->f:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 60
    const/4 v0, 0x3

    iget-object v1, p0, Ldba;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 62
    :cond_2
    iget-object v0, p0, Ldba;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 63
    const/4 v0, 0x4

    iget-object v1, p0, Ldba;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 65
    :cond_3
    iget-object v0, p0, Ldba;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 66
    const/4 v0, 0x5

    iget-object v1, p0, Ldba;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 68
    :cond_4
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 69
    return-void
.end method
