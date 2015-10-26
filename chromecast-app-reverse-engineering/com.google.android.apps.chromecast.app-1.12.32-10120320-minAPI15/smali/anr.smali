.class final Lanr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laoo;


# instance fields
.field private synthetic a:I

.field private synthetic b:Lanq;


# direct methods
.method constructor <init>(Lanq;I)V
    .locals 0

    .prologue
    .line 1243
    iput-object p1, p0, Lanr;->b:Lanq;

    iput p2, p0, Lanr;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 10

    .prologue
    const/4 v4, 0x1

    const/4 v6, 0x0

    .line 1248
    iget-object v0, p0, Lanr;->b:Lanq;

    iget-object v0, v0, Lanq;->a:Land;

    invoke-static {v0}, Land;->c(Land;)Z

    move-result v0

    if-nez v0, :cond_0

    move v5, v4

    .line 1249
    :goto_0
    iget-object v0, p0, Lanr;->b:Lanq;

    iget-object v0, v0, Lanq;->a:Land;

    iget-object v1, p0, Lanr;->b:Lanq;

    iget-object v1, v1, Lanq;->a:Land;

    sget v2, Lb;->ds:I

    new-array v3, v4, [Ljava/lang/Object;

    iget-object v7, p0, Lanr;->b:Lanq;

    iget-object v7, v7, Lanq;->a:Land;

    .line 1250
    invoke-virtual {v7}, Land;->D()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v6

    invoke-virtual {v1, v2, v3}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget v2, Lb;->du:I

    sget v3, Lb;->dv:I

    iget-object v7, p0, Lanr;->b:Lanq;

    iget-object v7, v7, Lanq;->a:Land;

    sget v8, Lb;->dt:I

    new-array v4, v4, [Ljava/lang/Object;

    iget v9, p0, Lanr;->a:I

    .line 1253
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v6

    invoke-virtual {v7, v8, v4}, Land;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1249
    invoke-static/range {v0 .. v5}, Land;->a(Land;Ljava/lang/String;IILjava/lang/String;Z)V

    .line 1255
    return-void

    :cond_0
    move v5, v6

    .line 1248
    goto :goto_0
.end method
