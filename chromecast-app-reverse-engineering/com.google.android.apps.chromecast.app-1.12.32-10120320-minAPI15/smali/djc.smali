.class final Ldjc;
.super Ldgj;
.source "PG"


# instance fields
.field private synthetic a:I

.field private synthetic b:Ldia;

.field private synthetic c:Ldjb;


# direct methods
.method varargs constructor <init>(Ldjb;Ljava/lang/String;[Ljava/lang/Object;ILdia;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Ldjc;->c:Ldjb;

    iput p4, p0, Ldjc;->a:I

    iput-object p5, p0, Ldjc;->b:Ldia;

    invoke-direct {p0, p2, p3}, Ldgj;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 348
    :try_start_0
    iget-object v0, p0, Ldjc;->c:Ldjb;

    iget v1, p0, Ldjc;->a:I

    iget-object v2, p0, Ldjc;->b:Ldia;

    invoke-virtual {v0, v1, v2}, Ldjb;->b(ILdia;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 351
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
