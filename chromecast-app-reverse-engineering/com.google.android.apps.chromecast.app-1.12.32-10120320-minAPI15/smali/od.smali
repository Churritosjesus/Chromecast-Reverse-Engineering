.class public final Lod;
.super Landroid/app/Dialog;
.source "PG"


# instance fields
.field private final a:Ltz;

.field private final b:Loe;

.field private c:Ltx;

.field private d:Ljava/util/ArrayList;

.field private e:Lof;

.field private f:Landroid/widget/ListView;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lod;-><init>(Landroid/content/Context;I)V

    .line 62
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 65
    invoke-static {p1}, La;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 54
    sget-object v0, Ltx;->c:Ltx;

    iput-object v0, p0, Lod;->c:Ltx;

    .line 66
    invoke-virtual {p0}, Lod;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 68
    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, p0, Lod;->a:Ltz;

    .line 69
    new-instance v0, Loe;

    .line 1240
    invoke-direct {v0, p0}, Loe;-><init>(Lod;)V

    .line 69
    iput-object v0, p0, Lod;->b:Loe;

    .line 70
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 180
    iget-boolean v0, p0, Lod;->g:Z

    if-eqz v0, :cond_2

    .line 181
    iget-object v0, p0, Lod;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 182
    iget-object v0, p0, Lod;->d:Ljava/util/ArrayList;

    invoke-static {}, Ltz;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 183
    iget-object v2, p0, Lod;->d:Ljava/util/ArrayList;

    .line 2115
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-lez v0, :cond_1

    .line 2116
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 2134
    invoke-virtual {v0}, Luh;->b()Z

    move-result v3

    if-nez v3, :cond_0

    .line 2897
    iget-boolean v3, v0, Luh;->e:Z

    .line 2134
    if-eqz v3, :cond_0

    iget-object v3, p0, Lod;->c:Ltx;

    invoke-virtual {v0, v3}, Luh;->a(Ltx;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 2116
    :goto_1
    if-nez v0, :cond_3

    .line 2117
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move v0, v1

    goto :goto_0

    .line 2134
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 184
    :cond_1
    iget-object v0, p0, Lod;->d:Ljava/util/ArrayList;

    sget-object v1, Log;->a:Log;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 185
    iget-object v0, p0, Lod;->e:Lof;

    invoke-virtual {v0}, Lof;->notifyDataSetChanged()V

    .line 187
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a(Ltx;)V
    .locals 3

    .prologue
    .line 88
    if-nez p1, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_0
    iget-object v0, p0, Lod;->c:Ltx;

    invoke-virtual {v0, p1}, Ltx;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 93
    iput-object p1, p0, Lod;->c:Ltx;

    .line 95
    iget-boolean v0, p0, Lod;->g:Z

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lod;->a:Ltz;

    iget-object v1, p0, Lod;->b:Loe;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 97
    iget-object v0, p0, Lod;->a:Ltz;

    iget-object v1, p0, Lod;->b:Loe;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Ltz;->a(Ltx;Lua;I)V

    .line 101
    :cond_1
    invoke-virtual {p0}, Lod;->a()V

    .line 103
    :cond_2
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 161
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 163
    iput-boolean v3, p0, Lod;->g:Z

    .line 164
    iget-object v0, p0, Lod;->a:Ltz;

    iget-object v1, p0, Lod;->c:Ltx;

    iget-object v2, p0, Lod;->b:Loe;

    invoke-virtual {v0, v1, v2, v3}, Ltz;->a(Ltx;Lua;I)V

    .line 165
    invoke-virtual {p0}, Lod;->a()V

    .line 166
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x3

    .line 139
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 141
    invoke-virtual {p0}, Lod;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/Window;->requestFeature(I)Z

    .line 143
    sget v0, La;->ck:I

    invoke-virtual {p0, v0}, Lod;->setContentView(I)V

    .line 144
    sget v0, La;->cn:I

    invoke-virtual {p0, v0}, Lod;->setTitle(I)V

    .line 147
    invoke-virtual {p0}, Lod;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lod;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, La;->ch:I

    invoke-static {v1, v2}, La;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v3, v1}, Landroid/view/Window;->setFeatureDrawableResource(II)V

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lod;->d:Ljava/util/ArrayList;

    .line 152
    new-instance v0, Lof;

    invoke-virtual {p0}, Lod;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lod;->d:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1, v2}, Lof;-><init>(Lod;Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lod;->e:Lof;

    .line 153
    sget v0, Lb;->p:I

    invoke-virtual {p0, v0}, Lod;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lod;->f:Landroid/widget/ListView;

    .line 154
    iget-object v0, p0, Lod;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lod;->e:Lof;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 155
    iget-object v0, p0, Lod;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lod;->e:Lof;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 156
    iget-object v0, p0, Lod;->f:Landroid/widget/ListView;

    const v1, 0x1020004

    invoke-virtual {p0, v1}, Lod;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 157
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lod;->g:Z

    .line 171
    iget-object v0, p0, Lod;->a:Ltz;

    iget-object v1, p0, Lod;->b:Loe;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 173
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 174
    return-void
.end method
