.class final Ladl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lads;

.field private final b:Lady;

.field private final c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Laeb;Lads;Lady;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p2, p0, Ladl;->a:Lads;

    .line 84
    iput-object p3, p0, Ladl;->b:Lady;

    .line 85
    iput-object p4, p0, Ladl;->c:Ljava/lang/Runnable;

    .line 86
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Ladl;->a:Lads;

    .line 1326
    iget-boolean v0, v0, Lads;->g:Z

    .line 92
    if-eqz v0, :cond_1

    .line 93
    iget-object v0, p0, Ladl;->a:Lads;

    const-string v1, "canceled-at-delivery"

    invoke-virtual {v0, v1}, Lads;->b(Ljava/lang/String;)V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 98
    :cond_1
    iget-object v0, p0, Ladl;->b:Lady;

    .line 2070
    iget-object v0, v0, Lady;->c:Laef;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 98
    :goto_1
    if-eqz v0, :cond_3

    .line 99
    iget-object v0, p0, Ladl;->a:Lads;

    iget-object v1, p0, Ladl;->b:Lady;

    iget-object v1, v1, Lady;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lads;->a(Ljava/lang/Object;)V

    .line 106
    :goto_2
    iget-object v0, p0, Ladl;->b:Lady;

    iget-boolean v0, v0, Lady;->d:Z

    if-eqz v0, :cond_4

    .line 107
    iget-object v0, p0, Ladl;->a:Lads;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lads;->a(Ljava/lang/String;)V

    .line 113
    :goto_3
    iget-object v0, p0, Ladl;->c:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Ladl;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 2070
    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 101
    :cond_3
    iget-object v0, p0, Ladl;->a:Lads;

    iget-object v1, p0, Ladl;->b:Lady;

    iget-object v1, v1, Lady;->c:Laef;

    invoke-virtual {v0, v1}, Lads;->b(Laef;)V

    goto :goto_2

    .line 109
    :cond_4
    iget-object v0, p0, Ladl;->a:Lads;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lads;->b(Ljava/lang/String;)V

    goto :goto_3
.end method
