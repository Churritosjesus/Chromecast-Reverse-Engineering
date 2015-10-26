.class final Lavz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavx;


# instance fields
.field private synthetic a:Lavy;


# direct methods
.method constructor <init>(Lavy;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lavz;->a:Lavy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(II)V
    .locals 2

    .prologue
    .line 53
    if-eqz p2, :cond_0

    .line 56
    iget-object v0, p0, Lavz;->a:Lavy;

    .line 1010
    iget v0, v0, Lavy;->a:I

    .line 56
    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 61
    iget-object v0, p0, Lavz;->a:Lavy;

    iget-object v1, p0, Lavz;->a:Lavy;

    .line 2010
    iget v1, v1, Lavy;->a:I

    .line 61
    add-int/lit8 v1, v1, -0xa

    .line 3010
    iput v1, v0, Lavy;->a:I

    .line 62
    iget-object v0, p0, Lavz;->a:Lavy;

    invoke-virtual {v0}, Lavy;->a()V

    .line 65
    :cond_0
    return-void
.end method
