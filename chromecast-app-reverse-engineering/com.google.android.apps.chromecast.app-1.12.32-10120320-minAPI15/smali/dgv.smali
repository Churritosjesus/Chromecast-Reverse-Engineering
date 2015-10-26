.class public final Ldgv;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ldfy;

.field public final b:Ldgc;


# direct methods
.method public constructor <init>(Ldfy;Ldgc;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ldgv;->a:Ldfy;

    .line 42
    iput-object p2, p0, Ldgv;->b:Ldgc;

    .line 43
    return-void
.end method

.method public static a(Ldgc;Ldfy;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 52
    .line 1088
    iget v1, p0, Ldgc;->c:I

    .line 52
    sparse-switch v1, :sswitch_data_0

    .line 86
    :cond_0
    :goto_0
    return v0

    .line 72
    :sswitch_0
    const-string v1, "Expires"

    invoke-virtual {p0, v1}, Ldgc;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 73
    invoke-virtual {p0}, Ldgc;->c()Ldfb;

    move-result-object v1

    .line 1100
    iget v1, v1, Ldfb;->c:I

    .line 73
    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 74
    invoke-virtual {p0}, Ldgc;->c()Ldfb;

    move-result-object v1

    .line 1117
    iget-boolean v1, v1, Ldfb;->e:Z

    .line 74
    if-nez v1, :cond_1

    .line 75
    invoke-virtual {p0}, Ldgc;->c()Ldfb;

    move-result-object v1

    .line 2113
    iget-boolean v1, v1, Ldfb;->d:Z

    .line 75
    if-eqz v1, :cond_0

    .line 86
    :cond_1
    :sswitch_1
    invoke-virtual {p0}, Ldgc;->c()Ldfb;

    move-result-object v1

    .line 3092
    iget-boolean v1, v1, Ldfb;->b:Z

    .line 86
    if-nez v1, :cond_0

    invoke-virtual {p1}, Ldfy;->d()Ldfb;

    move-result-object v1

    .line 4092
    iget-boolean v1, v1, Ldfb;->b:Z

    .line 86
    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 52
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_1
        0xcb -> :sswitch_1
        0xcc -> :sswitch_1
        0x12c -> :sswitch_1
        0x12d -> :sswitch_1
        0x12e -> :sswitch_0
        0x133 -> :sswitch_0
        0x134 -> :sswitch_1
        0x194 -> :sswitch_1
        0x195 -> :sswitch_1
        0x19a -> :sswitch_1
        0x19e -> :sswitch_1
        0x1f5 -> :sswitch_1
    .end sparse-switch
.end method
