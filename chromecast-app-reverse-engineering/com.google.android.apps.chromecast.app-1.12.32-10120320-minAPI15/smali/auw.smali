.class final Lauw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lauv;


# direct methods
.method constructor <init>(Lauv;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lauw;->a:Lauv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lauw;->a:Lauv;

    .line 1024
    iget v1, v0, Lauv;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lauv;->a:I

    .line 66
    iget-object v0, p0, Lauw;->a:Lauv;

    iget-boolean v0, v0, Lauv;->c:Z

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lauw;->a:Lauv;

    .line 2024
    iget v0, v0, Lauv;->a:I

    .line 67
    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 69
    iget-object v0, p0, Lauw;->a:Lauv;

    invoke-static {v0}, Lauv;->a(Lauv;)V

    .line 74
    :cond_0
    :goto_0
    return-void

    .line 71
    :cond_1
    iget-object v0, p0, Lauw;->a:Lauv;

    invoke-virtual {v0}, Lauv;->a()Z

    goto :goto_0
.end method
