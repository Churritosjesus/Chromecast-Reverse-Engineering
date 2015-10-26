.class public final Ldbq;
.super Ldew;
.source "PG"


# static fields
.field private static volatile f:[Ldbq;


# instance fields
.field public a:Ljava/lang/Long;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 47
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1052
    iput-object v0, p0, Ldbq;->a:Ljava/lang/Long;

    .line 1053
    iput-object v0, p0, Ldbq;->b:Ljava/lang/String;

    .line 1054
    iput-object v0, p0, Ldbq;->c:Ljava/lang/String;

    .line 1055
    iput-object v0, p0, Ldbq;->d:Ljava/lang/Integer;

    .line 1056
    iput-object v0, p0, Ldbq;->g:Ljava/lang/String;

    .line 1057
    iput-object v0, p0, Ldbq;->h:Ljava/lang/String;

    .line 1058
    iput-object v0, p0, Ldbq;->i:Ljava/lang/String;

    .line 1059
    iput-object v0, p0, Ldbq;->e:Ljava/lang/String;

    .line 1060
    const/4 v0, -0x1

    iput v0, p0, Ldbq;->t:I

    .line 49
    return-void
.end method

.method public static b()[Ldbq;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldbq;->f:[Ldbq;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldbq;->f:[Ldbq;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldbq;

    sput-object v0, Ldbq;->f:[Ldbq;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldbq;->f:[Ldbq;

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
    .locals 4

    .prologue
    .line 96
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 97
    iget-object v1, p0, Ldbq;->a:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 98
    const/4 v1, 0x1

    iget-object v2, p0, Ldbq;->a:Ljava/lang/Long;

    .line 99
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 101
    :cond_0
    iget-object v1, p0, Ldbq;->b:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 102
    const/4 v1, 0x2

    iget-object v2, p0, Ldbq;->b:Ljava/lang/String;

    .line 103
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 105
    :cond_1
    iget-object v1, p0, Ldbq;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 106
    const/4 v1, 0x3

    iget-object v2, p0, Ldbq;->c:Ljava/lang/String;

    .line 107
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 109
    :cond_2
    iget-object v1, p0, Ldbq;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 110
    const/4 v1, 0x4

    iget-object v2, p0, Ldbq;->d:Ljava/lang/Integer;

    .line 111
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 113
    :cond_3
    iget-object v1, p0, Ldbq;->g:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 114
    const/4 v1, 0x5

    iget-object v2, p0, Ldbq;->g:Ljava/lang/String;

    .line 115
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 117
    :cond_4
    iget-object v1, p0, Ldbq;->h:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 118
    const/4 v1, 0x6

    iget-object v2, p0, Ldbq;->h:Ljava/lang/String;

    .line 119
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 121
    :cond_5
    iget-object v1, p0, Ldbq;->i:Ljava/lang/String;

    if-eqz v1, :cond_6

    .line 122
    const/4 v1, 0x7

    iget-object v2, p0, Ldbq;->i:Ljava/lang/String;

    .line 123
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 125
    :cond_6
    iget-object v1, p0, Ldbq;->e:Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 126
    const/16 v1, 0x8

    iget-object v2, p0, Ldbq;->e:Ljava/lang/String;

    .line 127
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 129
    :cond_7
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 5
    .line 1137
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1138
    sparse-switch v0, :sswitch_data_0

    .line 1142
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1143
    :sswitch_0
    return-object p0

    .line 1148
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldbq;->a:Ljava/lang/Long;

    goto :goto_0

    .line 1152
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->b:Ljava/lang/String;

    goto :goto_0

    .line 1156
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->c:Ljava/lang/String;

    goto :goto_0

    .line 2169
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1160
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldbq;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 1164
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->g:Ljava/lang/String;

    goto :goto_0

    .line 1168
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->h:Ljava/lang/String;

    goto :goto_0

    .line 1172
    :sswitch_7
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->i:Ljava/lang/String;

    goto :goto_0

    .line 1176
    :sswitch_8
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldbq;->e:Ljava/lang/String;

    goto :goto_0

    .line 1138
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x2a -> :sswitch_5
        0x32 -> :sswitch_6
        0x3a -> :sswitch_7
        0x42 -> :sswitch_8
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 67
    iget-object v0, p0, Ldbq;->a:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 68
    const/4 v0, 0x1

    iget-object v1, p0, Ldbq;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 70
    :cond_0
    iget-object v0, p0, Ldbq;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 71
    const/4 v0, 0x2

    iget-object v1, p0, Ldbq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 73
    :cond_1
    iget-object v0, p0, Ldbq;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 74
    const/4 v0, 0x3

    iget-object v1, p0, Ldbq;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 76
    :cond_2
    iget-object v0, p0, Ldbq;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 77
    const/4 v0, 0x4

    iget-object v1, p0, Ldbq;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 79
    :cond_3
    iget-object v0, p0, Ldbq;->g:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 80
    const/4 v0, 0x5

    iget-object v1, p0, Ldbq;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 82
    :cond_4
    iget-object v0, p0, Ldbq;->h:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 83
    const/4 v0, 0x6

    iget-object v1, p0, Ldbq;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 85
    :cond_5
    iget-object v0, p0, Ldbq;->i:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 86
    const/4 v0, 0x7

    iget-object v1, p0, Ldbq;->i:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 88
    :cond_6
    iget-object v0, p0, Ldbq;->e:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 89
    const/16 v0, 0x8

    iget-object v1, p0, Ldbq;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 91
    :cond_7
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 92
    return-void
.end method
