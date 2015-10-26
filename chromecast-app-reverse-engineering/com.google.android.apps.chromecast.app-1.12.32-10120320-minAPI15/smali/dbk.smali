.class public final Ldbk;
.super Ldew;
.source "PG"


# static fields
.field private static volatile e:[Ldbk;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ldbj;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Integer;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ldew;-><init>()V

    .line 42
    iput-object v0, p0, Ldbk;->a:Ljava/lang/String;

    .line 43
    iput-object v0, p0, Ldbk;->b:Ldbj;

    .line 44
    iput-object v0, p0, Ldbk;->c:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Ldbk;->f:Ljava/lang/String;

    .line 46
    iput-object v0, p0, Ldbk;->g:Ljava/lang/String;

    .line 47
    iput-object v0, p0, Ldbk;->d:Ljava/lang/Integer;

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Ldbk;->t:I

    .line 49
    return-void
.end method

.method public static b()[Ldbk;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldbk;->e:[Ldbk;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldbk;->e:[Ldbk;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldbk;

    sput-object v0, Ldbk;->e:[Ldbk;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldbk;->e:[Ldbk;

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
    .line 77
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 78
    iget-object v1, p0, Ldbk;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 79
    const/4 v1, 0x1

    iget-object v2, p0, Ldbk;->a:Ljava/lang/String;

    .line 80
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 82
    :cond_0
    iget-object v1, p0, Ldbk;->b:Ldbj;

    if-eqz v1, :cond_1

    .line 83
    const/4 v1, 0x2

    iget-object v2, p0, Ldbk;->b:Ldbj;

    .line 84
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 86
    :cond_1
    iget-object v1, p0, Ldbk;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 87
    const/4 v1, 0x3

    iget-object v2, p0, Ldbk;->c:Ljava/lang/String;

    .line 88
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 90
    :cond_2
    iget-object v1, p0, Ldbk;->f:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 91
    const/4 v1, 0x4

    iget-object v2, p0, Ldbk;->f:Ljava/lang/String;

    .line 92
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 94
    :cond_3
    iget-object v1, p0, Ldbk;->g:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 95
    const/4 v1, 0x5

    iget-object v2, p0, Ldbk;->g:Ljava/lang/String;

    .line 96
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 98
    :cond_4
    iget-object v1, p0, Ldbk;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 99
    const/4 v1, 0x6

    iget-object v2, p0, Ldbk;->d:Ljava/lang/Integer;

    .line 100
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 102
    :cond_5
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 5
    .line 1110
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1111
    sparse-switch v0, :sswitch_data_0

    .line 1115
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1116
    :sswitch_0
    return-object p0

    .line 1121
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbk;->a:Ljava/lang/String;

    goto :goto_0

    .line 1125
    :sswitch_2
    iget-object v0, p0, Ldbk;->b:Ldbj;

    if-nez v0, :cond_1

    .line 1126
    new-instance v0, Ldbj;

    invoke-direct {v0}, Ldbj;-><init>()V

    iput-object v0, p0, Ldbk;->b:Ldbj;

    .line 1128
    :cond_1
    iget-object v0, p0, Ldbk;->b:Ldbj;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1132
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbk;->c:Ljava/lang/String;

    goto :goto_0

    .line 1136
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbk;->f:Ljava/lang/String;

    goto :goto_0

    .line 1140
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbk;->g:Ljava/lang/String;

    goto :goto_0

    .line 1169
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1144
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbk;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 1111
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x22 -> :sswitch_4
        0x2a -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Ldbk;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 55
    const/4 v0, 0x1

    iget-object v1, p0, Ldbk;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 57
    :cond_0
    iget-object v0, p0, Ldbk;->b:Ldbj;

    if-eqz v0, :cond_1

    .line 58
    const/4 v0, 0x2

    iget-object v1, p0, Ldbk;->b:Ldbj;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 60
    :cond_1
    iget-object v0, p0, Ldbk;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 61
    const/4 v0, 0x3

    iget-object v1, p0, Ldbk;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 63
    :cond_2
    iget-object v0, p0, Ldbk;->f:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 64
    const/4 v0, 0x4

    iget-object v1, p0, Ldbk;->f:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 66
    :cond_3
    iget-object v0, p0, Ldbk;->g:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 67
    const/4 v0, 0x5

    iget-object v1, p0, Ldbk;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 69
    :cond_4
    iget-object v0, p0, Ldbk;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 70
    const/4 v0, 0x6

    iget-object v1, p0, Ldbk;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 72
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 73
    return-void
.end method
